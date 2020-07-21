package vip.qicp.yc111.ListPort;
/*
* List 接口的链接列表实现。实现所有可选的列表操作，并且允许所有元素（包括 null）。
* 除了实现 List 接口外，LinkedList 类还为在列表的开头及结尾 get、remove 和 insert 元素提供了统一的命名方法。
* 这些操作允许将链接列表用作堆栈、队列或双端队列。
*
* LinkedList是双向链表，非同步实现
* */
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

    Person p1 = new Person("小明",16);
    Person p2 = new Person("小张",17);
    Person p3 = new Person("小红",18);
    Person p4 = new Person("小杨",16);

    List<Person> list1 = new LinkedList<Person>();

    //方法摘要
    public void LinkedListMethod(){
        System.out.println(this.list1); //[]
        /*
        *  boolean add(E e)
          将指定元素添加到此列表的结尾。
        * */
        this.list1.add(this.p1);
        System.out.println(list1);  //[Person{name='小明', age=16}]
        this.list1.add(this.p2);
        System.out.println(list1);  //[Person{name='小明', age=16}, Person{name='小张', age=17}]

        /*
        *  void addFirst(E e)
          将指定元素插入此列表的开头。
        * 注意：addFirst是LinkedList的特有方法，使用时需要将List引用对象向下转型
        * */
//        LinkedList lnk1 = (LinkedList)this.list1;
//        lnk1.addFirst(this.p4);
        //向下转型简写方式
        ((LinkedList<Person>) this.list1).addFirst(this.p4);
        System.out.println(this.list1); //[Person{name='小杨', age=16}, Person{name='小明', age=16}, Person{name='小张', age=17}]
        /*
        * void addLast(E e)
          将指定元素添加到此列表的结尾。
        * 注意：addFirst是LinkedList的特有方法，使用时需要将List引用对象向下转型
        * */
//        lnk1.addLast(this.p3);
        ((LinkedList<Person>) this.list1).addLast(this.p3);
        System.out.println(this.list1);
        //[Person{name='小杨', age=16}, Person{name='小明', age=16}, Person{name='小张', age=17}, Person{name='小红', age=18}]

        /*
        *  E removeFirst()
          移除并返回此列表的第一个元素。
        * */
        Person rmp1 = ((LinkedList<Person>) this.list1).removeFirst();
        System.out.println("被移除的第一个元素是： "+rmp1);    //被移除的第一个元素是： Person{name='小杨', age=16}
        System.out.println(this.list1);  //[Person{name='小明', age=16}, Person{name='小张', age=17}, Person{name='小红', age=18}]

        /*
        *  E removeLast()
          移除并返回此列表的最后一个元素。
        * */
        Person rmp2 = ((LinkedList<Person>) this.list1).removeLast();
        System.out.println("被移除的最后一个元素是： "+rmp2);   //被移除的最后一个元素是： Person{name='小红', age=18}
        System.out.println(this.list1); //[Person{name='小明', age=16}, Person{name='小张', age=17}]

        /*
        *  E pop()
          从此列表所表示的堆栈处弹出一个元素。此方法等效于 removeFirst()。
        * */
        Person pop1 = ((LinkedList<Person>) this.list1).pop();
        System.out.println("被弹出的元素是： "+pop1);   //被弹出的元素是： Person{name='小明', age=16}
        System.out.println(this.list1); //[Person{name='小张', age=17}]

        /*
        * void push(E e)
          将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E)。
        * */
        ((LinkedList<Person>) this.list1).push(this.p3);
        System.out.println(this.list1); //[Person{name='小红', age=18}, Person{name='小张', age=17}]

        /*
        *  void clear()
          从此列表中移除所有元素。
        * */

        this.list1.clear();
        System.out.println(this.list1);

        //判断list1是否为空
        boolean empty = this.list1.isEmpty();
        System.out.println("集合是否为空："+empty);

    }

    /*
    * 可变参数
    * 修饰符 返回值类型 方法名(参数类型... 形参名){ }
    * */
    public void varargs(Person... people){
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
