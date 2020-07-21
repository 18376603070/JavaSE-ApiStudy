package vip.qicp.yc111.SetPort;

import java.util.HashSet;
import java.util.Set;

/*
* java.util.HashSet 是 Set 接口的一个实现类，它所存储的元素是不可重复的，并且元素都是无序的(即存取顺序
* 不一致)。 java.util.HashSet 底层的实现其实是一个 java.util.HashMap 支持
*
* HashSet 是根据对象的哈希值来确定元素在集合中的存储位置，因此具有良好的存取和查找性能。保证元素唯一性
* 的方式依赖于： hashCode 与 equals 方法。
* */
public class HashSetClass {
    static {
        System.out.println(HashSetClass.class);
    }

    Person p1 = new Person("迪丽热巴",26);
    Person p2 = new Person("古力娜扎",26);
    Person p3 = new Person("马尔扎哈",26);
    Person p4 = new Person("马尔扎哈",26);

    Set<Person> set1 = new HashSet<Person>();

    public void hashSetMethod(){
        System.out.println(this.set1);

        /*
        *  boolean add(E e)
          如果此 set 中尚未包含指定元素，则添加指定元素。
        * */
        this.set1.add(this.p1);
        System.out.println(this.set1);  //[Person{name='迪丽热巴', age=26}]
        this.set1.add(this.p2);
        System.out.println(this.set1);  //[Person{name='古力娜扎', age=26}, Person{name='迪丽热巴', age=26}]
        this.set1.add(this.p3);
        System.out.println(this.set1);  //[Person{name='马尔扎哈', age=26}, Person{name='古力娜扎', age=26}, Person{name='迪丽热巴', age=26}]
        this.set1.add(this.p4);
        System.out.println(this.set1);  //[Person{name='马尔扎哈', age=26}, Person{name='古力娜扎', age=26}, Person{name='迪丽热巴', age=26}]

        /*
        * boolean contains(Object o)
          如果此 set 包含指定元素，则返回 true。
        * */
        boolean con1 = this.set1.contains(new Person("马尔扎哈",26));
        System.out.println("是否包含对象Person(\"马尔扎哈\",26)： "+con1); //是否包含对象Person("马尔扎哈",26)： true
        boolean con2 = this.set1.contains(new Person("古力娜扎", 36));
        System.out.println("是否包含对象Person(\"古力娜扎\", 36)： "+con2);    //是否包含对象Person("古力娜扎", 36)： false

        /*
        * boolean remove(Object o)
          如果指定元素存在于此 set 中，则将其移除。
        * */
        boolean con3 = this.set1.remove(new Person("马尔扎哈", 26));
        System.out.println("是否移除了Person(\"马尔扎哈\", 26)对象： "+con3);   //是否移除了Person("马尔扎哈", 26)对象： true
        if(con3)System.out.println(this.set1);  //[Person{name='古力娜扎', age=26}, Person{name='迪丽热巴', age=26}]

        boolean con4 = this.set1.remove(p3);
        System.out.println("是否移除了this.p3对象： "+con4);    //是否移除了this.p3对象： false
        if(con4) System.out.println(this.set1);

        /*
        *  void clear()
          从此 set 中移除所有元素。
        * */
        this.set1.clear();
        System.out.println(this.set1);  //[]

        /*
        *  boolean isEmpty()
          如果此 set 不包含任何元素，则返回 true。
        * */

        boolean empty = this.set1.isEmpty();
        System.out.println("set1集合是否是空集合： "+empty); //set1集合是否是空集合： true
        if(!empty) System.out.println(this.set1);
    }
}
