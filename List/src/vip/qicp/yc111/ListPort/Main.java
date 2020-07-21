package vip.qicp.yc111.ListPort;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Person> l1 = new LinkedListClass().list1;
//        System.out.println(l1);
        //匿名对象调用LinkedList方法示例方法
        new LinkedListClass().LinkedListMethod();
        System.out.println("可变参数的使用：");
        new LinkedListClass().varargs(new Person("张三",19),new Person("李四",26),new Person("赵武",37));
        //Person{name='张三', age=19}
        //Person{name='李四', age=26}
        //Person{name='赵武', age=37}



    }
}
