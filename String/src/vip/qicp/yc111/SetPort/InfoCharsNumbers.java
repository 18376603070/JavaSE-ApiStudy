package vip.qicp.yc111.SetPort;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 需求：键盘录入一个字符，统计字符串中大小写字母及数字字符个数
* */
public class InfoCharsNumbers {

    static {
        //静态代码块
        //打印类名信息
        System.out.println(InfoCharsNumbers.class);
    }

    private String str = new String();
    private Scanner scStr = new Scanner(System.in);

    private ArrayList<Character> upperCase = new ArrayList<>();
    private ArrayList<Character> lowCase = new ArrayList<>();
    private ArrayList<Character> otherChars = new ArrayList<>();
    private ArrayList<Character> numbers = new ArrayList<>();


    public InfoCharsNumbers() {
    }

    public InfoCharsNumbers(String str, Scanner scStr) {
        this.str = str;
        this.scStr = scStr;
    }

    private void InfoCharNumbersFunction(){
        System.out.println("请输入长度在1-50的字符串：(直接退出请输入EXIT)");
        while(true)
        {
            this.str = scStr.next();
            if("EXIT".equals(this.str)){
                System.out.println("程序已退出！");
                return;
            }else if(this.str.length()<1){
                System.out.println("输入的字符串长度过短，请重新输入：");
            }else if(this.str.length()>50){
                System.out.println("输入的字符串长度过长，请重新输入:");
            }else{
                break;
            }
        }
        System.out.println("您输入的字符串是："+this.str);
        System.out.println();
        char[] chars = this.str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='A' && chars[i]<='Z'){
                this.upperCase.add(chars[i]);
            }else if(chars[i]>='a' && chars[i]<='z'){
                this.lowCase.add(chars[i]);
            }else if(chars[i]>='0' && chars[i]<='9'){
                this.numbers.add(chars[i]);
            }else{
                this.otherChars.add(chars[i]);
            }
        }

        System.out.println("大写字符有：");
        this.printChars(this.upperCase);
/*        for (int i = 0; i < this.upperCase.size(); i++) {
            System.out.print(this.upperCase.get(i)+" ");
        }
        System.out.println(" 总计："+this.upperCase.size());*/

        System.out.println("小写字符有：");
        this.printChars(this.lowCase);
/*        for (int i = 0; i < this.lowCase.size(); i++) {
            System.out.print(this.lowCase.get(i)+" ");
        }
        System.out.println(" 总计："+this.lowCase.size());*/

        System.out.println("数字有：");
        this.printChars(this.numbers);
/*        for (int i = 0; i < this.numbers.size(); i++) {
            System.out.print(this.numbers.get(i)+" ");
        }
        System.out.println(" 总计："+this.numbers.size());*/

        System.out.println("其他字符有：");
        this.printChars(this.otherChars);
/*        for (int i = 0; i < this.otherChars.size(); i++) {
            System.out.print(this.otherChars.get(i)+" ");
        }
        System.out.println(" 总计："+this.otherChars.size());*/
    }

    public void startInfo(){
        this.InfoCharNumbersFunction();
    }
    private void printChars(ArrayList<Character> list){

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(" 总计："+list.size());
    }
}
