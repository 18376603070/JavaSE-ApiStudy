package vip.qicp.yc111.SetPort;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
* HashSet保证元素唯一，可是元素存放进去是没有顺序的。
* 在HashSet下面有一个子类 java.util.LinkedHashSet ，它是链表和哈希表组合的一个数据存储结构。
* LinkedHashSet在保证元素的唯一性的基础上又保存的元素存储的顺序
* */
public class LinkedHashSetClass {
    static {
        System.out.println(LinkedHashSetClass.class);
    }
    /*
    * LinkedHashSet的方法与LinkedSet相同，只是增加了元素存储的顺序
    * */
    Person p1 = new Person("迪丽热巴",26);
    Person p2 = new Person("古力娜扎",26);
    Person p3 = new Person("马尔扎哈",26);
    Person p4 = new Person("马尔扎哈",26);

    Set<Person> set2 = new LinkedHashSet<>();

    public void linkedHashSetMethod() {
        System.out.println(this.set2);

        /*
        *  boolean add(E e)
          如果此 set 中尚未包含指定元素，则添加指定元素。
        * */
        this.set2.add(this.p1);
        System.out.println(this.set2);  //[Person{name='迪丽热巴', age=26}]
        this.set2.add(this.p2);
        System.out.println(this.set2);  //[Person{name='迪丽热巴', age=26}, Person{name='古力娜扎', age=26}]
        this.set2.add(this.p3);
        System.out.println(this.set2);  //[Person{name='迪丽热巴', age=26}, Person{name='古力娜扎', age=26}, Person{name='马尔扎哈', age=26}]
        this.set2.add(this.p4);
        System.out.println(this.set2);  //[Person{name='迪丽热巴', age=26}, Person{name='古力娜扎', age=26}, Person{name='马尔扎哈', age=26}]

        /*
        * boolean contains(Object o)
          如果此 set 包含指定元素，则返回 true。
        * */
        boolean con1 = this.set2.contains(new Person("马尔扎哈", 26));
        System.out.println("是否包含对象Person(\"马尔扎哈\",26)： " + con1); //是否包含对象Person("马尔扎哈",26)： true
        boolean con2 = this.set2.contains(new Person("古力娜扎", 36));
        System.out.println("是否包含对象Person(\"古力娜扎\", 36)： " + con2);    //是否包含对象Person("古力娜扎", 36)： false

        /*
        * boolean remove(Object o)
          如果指定元素存在于此 set 中，则将其移除。
        * */
        boolean con3 = this.set2.remove(new Person("马尔扎哈", 26));
        System.out.println("是否移除了Person(\"马尔扎哈\", 26)对象： " + con3);   //是否移除了Person("马尔扎哈", 26)对象： true
        if (con3) System.out.println(this.set2);  //[Person{name='迪丽热巴', age=26}, Person{name='古力娜扎', age=26}]

        boolean con4 = this.set2.remove(p3);
        System.out.println("是否移除了this.p3对象： " + con4);    //是否移除了this.p3对象： false
        if (con4) System.out.println(this.set2);

        /*
        *  void clear()
          从此 set 中移除所有元素。
        * */
        this.set2.clear();
        System.out.println(this.set2);  //[]

        /*
        *  boolean isEmpty()
          如果此 set 不包含任何元素，则返回 true。
        * */

        boolean empty = this.set2.isEmpty();
        System.out.println("set1集合是否是空集合： " + empty); //set1集合是否是空集合： true
        if (!empty) System.out.println(this.set2);
    }
}
