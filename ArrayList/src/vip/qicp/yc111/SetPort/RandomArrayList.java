package vip.qicp.yc111.SetPort;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * 用户输入一个>0的正整数，生成该个数的随机出存储到ArrayList集合中(随机数1-100)
 * */
public class RandomArrayList {

    private Scanner scNum = new Scanner(System.in);
    private Random random = new Random();
    private ArrayList<Integer> arr = new ArrayList<>();
    private ArrayList<Integer> evenNumbers = new ArrayList<>();
    private ArrayList<Integer> unevenNumbers = new ArrayList<>();

    public RandomArrayList() {

    }

    private void storageRandomNumber() {
        System.out.println("请输入需要生成随机数的个数：(输入范围是1-100)");
        int numbers = this.scNum.nextInt();
        if (numbers > 100 || numbers < 1) {
            System.out.println("您未按要求输入，程序直接结束");
            return;
        }
        for (int i = 0; i < numbers; i++) {
            this.arr.add(this.random.nextInt(100) + 1);
        }
        System.out.println("生成的随机数是：");
        int index = 0;
        for (int i : this.arr
        ) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                this.evenNumbers.add(i);
            } else {
                this.unevenNumbers.add(i);
            }
            index++;
            if (index % 10 == 0 && index != 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("其中的偶数是：");
        for (int i = 0; i < this.evenNumbers.size(); i++) {
            System.out.print(this.evenNumbers.get(i) + " ");
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("其中奇数是：");
        for (int i = 0; i < this.unevenNumbers.size(); i++) {
            System.out.print(this.unevenNumbers.get(i) + " ");
            if (i % 10 == 0 && i != 0) {
                System.out.println();//仅用作换行
            }
        }
    }

    public void storageStart() {
        this.storageRandomNumber();
    }
}
