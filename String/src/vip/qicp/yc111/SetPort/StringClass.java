package vip.qicp.yc111.SetPort;

/*
* String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
* 字符串是常量；它们的值在创建之后不能更改。字符串缓冲区支持可变的字符串。因为 String 对象是不可变的，所以可以共享。
*
* 类 String 中包括用于检查各个字符串的方法，比如用于比较字符串，搜索字符串，提取子字符串以及创建具有翻
* 译为大写或小写的所有字符的字符串的副本。
* 特点：
*   字符串的值在创建后不能被更改。
*
* 构造方法
*   public String() ：初始化新创建的String对象，以使其表示空字符序列
*   public String(char[] value) ：通过当前参数的中的字符数组来构造新的String。
*   public String(byte[] bytes) ：通过使用平台的默认字符集解码当前参数中的字节组来构造新的String
*
* 常用方法
*   public boolean equals (Object anObject) ：将此字符串与指定对象进行比较。
*   public boolean equalsIgnoreCase (String anotherString) ：将此字符串与指定对象进行比较，忽略大小写。
*
* 获取功能的方法
*   public int length() ：返回字符串的长度
*   public String concat(String str) ：将指定的字符串连接到该字符串的末尾
*   public char charAt(int index) ：返回指定索引处的char值
*   public int indexOf(String str) ：返回指定字符串第一次出现在该字符串内的索引
*   public String substring(int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。
*   public String substring(int beginIndex,int endIndex) ：返回一个子字符串，从beginIndex到endIndex截取字符串。
*                                                          包含geginIndex，不含endIndex。
*
* 转换功能的方法
*   public char[] toCharArray() ：将此字符串转换为新的字符数组。
*   public byte[] getBytes() ：使用平台的默认字符集将该String编码转换为新的字节数组
*   public String replace (CharSequence target, CharSequence replacement) ：将于target匹配的字符串使用replacement字符串替换。
*
* 分割功能的方法
*   public String[] split(String regex) ：将此字符串按照给定的regex（规则）拆分为字符数组。
* */


public class StringClass {
    public static void main(String[] args) {

        //无参构造
        String str = new String();

        //通过字符数组构造
        char[] chars = {'a','b','c','d'};
        String str2 = new String(chars);
        System.out.println(str2);

        //通过字节数组构造
        byte[] bytes = {97,98,99};
        String str3 = new String(bytes);
        System.out.println(str3);

        String data = "Are You OK?";
        //
        System.out.println(data.toCharArray()[0]);
        System.out.println(data.toCharArray().length);
        for (int i = 0; i < data.getBytes().length; i++) {
            System.out.println(data.getBytes()[i]);
        }

        /*
        * 利用Lambda表达式的写法创建了3个线程
        * */
        //Lambda表达式的一般写法
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i <20; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //Lambda表达式的简写
        new Thread(()-> System.out.println(Thread.currentThread().getName())).start();

        //内部类的写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                new InfoCharsNumbers().startInfo();
            }
        }).start();
    }
}
