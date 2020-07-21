package vip.qicp.yc111.SetPort;

import java.util.Random;
import java.util.Scanner;

/*
* 猜数字小游戏
* 游戏开始时，会随机生成一个1-100之间的整数 number 。玩家猜测一个数字 guessNumber ，会与 number 作比较，系统提示大了或者小了，
* 直到玩家猜中，游戏结束。
* */
public class SmallGame {

    public SmallGame() {
    }

    //游戏开始时随机生成的一个1—100的整数
    private int number = 0;

    //客户猜测的数字
    private int guessNumber = 0;

    //游戏规则实现函数
    private void guessNumberSmallGame(){
        System.out.println("已进入猜数字小游戏，退出该游戏可在控制输入数字0 ");
        //使用Scanner对象定义玩家输入的猜测的数字
        Scanner scannerNumber = new Scanner(System.in);
        //使用this.number接收1-100的随机整数
        this.number = new Random().nextInt(100)+1;
        do {
            System.out.println("请输入您需要猜测的数字:");
            this.guessNumber = scannerNumber.nextInt();
            if (guessNumber==0) {
                System.out.println("您选择了直接结束游戏！");
                break;
            }else if(this.guessNumber>number){
                System.out.println("您好，您输入的数字大了！");
            }else if(this.guessNumber<number){
                System.out.println("您好，您输入的数字小了");
            }else{
                System.out.println("恭喜！猜对了！ 答案是： "+number);
                break;
            }
        }while(true);
        System.out.println("游戏结束！");
    }

    public void gameStart(){
        this.guessNumberSmallGame();
    }
}
