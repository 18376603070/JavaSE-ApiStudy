package vip.qicp.yc111.SetPort;
/*
* Set接口
* Set接口和List接口一样 ，同样继承自Collection接口，他与Collection接口中的方法基本一致
* 并没有对Collection接口进行功能上的扩充，只是比Collection接口更加严格了。与List接口不同的是
* Set接口中元素无序，并且都会以某种规则保证存入的元素不出现重复
* */
public class Main {
    public static void main(String[] args) {
        new HashSetClass().hashSetMethod();
        new LinkedHashSetClass().linkedHashSetMethod();
    }
}
