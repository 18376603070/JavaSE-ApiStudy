package vip.qicp.yc111.SetPort;

import java.util.Random;
/*
* 此类的实例用于生成伪随机数流
* 构造方法：
*   Random() 创建一个新的随机数生成器。
*   Random(long seed) 使用单个 long 种子创建一个新的随机数生成器。
* */

public class Main {
    public static void main(String[] args) {
        //创建一个Random对象randNum1
        Random randNum1 = new Random();

        /*
        * int nextInt(int n)
        * 返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
        *
        * int nextInt(int n) + 1
        * 对返回的随机数值整体 + 1，所以返回的结果变为了1~n+1
        * */
        System.out.println("-------int nextInt(int n)--------");
        System.out.println("-------使用int类型1个参数的重载方法--------");
        for (int i = 0; i <10; i++) {
            System.out.print(randNum1.nextInt(10)+1+" ");
        }
        System.out.println();//当作换行使用
        System.out.println();//当作换行使用
        /*
        * int nextInt()
        * 返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
        *
        * 返回值为整个int类型的取值范围（ -2,147,483,648 至 2,147,483,647 ）
        *
        * int nextInt()%10+1
        * 整个int范围的数值对10求余数后+1，所以结果可能有负数以及正数，结果>0或者<0
        * */
        System.out.println("-------int nextInt()--------");
        System.out.println("-------使用空参数的重载方法--------");
        for (int i = 0; i <10; i++) {
            System.out.print(randNum1.nextInt()%10+1+" ");
        }
        System.out.println();//当作换行使用
        System.out.println();//当作换行使用

        new SmallGame().gameStart();
    }
}
