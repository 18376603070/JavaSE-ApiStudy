package vip.qicp.yc111.SetPort;

import java.util.ArrayList;
/*
 * ArrayList是List接口的一个实现类
 * List 接口的大小可变数组的实现。实现了所有可选列表操作，并允许包括 null 在内的所有元素。除了实现 List 接口外，
 * 此类还提供一些方法来操作内部用来存储列表的数组的大小。（此类大致上等同于 Vector 类，除了此类是不同步的。）
 *
 * 方法摘要
 * public boolean add(E e)
 * 将指定的元素添加到此列表的尾部。
 *
 * public void add(int index,E element)
 * 将指定的元素插入此列表中的指定位置。向右移动当前位于该位置的元素（如果有）以及所有后续元素（将其索引加 1）。
 *
 * public E remove(int index)
 * 移除此列表中指定位置上的元素。向左移动所有后续元素（将其索引减 1）。返回：从列表种移除的元素
 *
 * public boolean remove(Object o)
 * 移除列表中首次出现的指定元素（如果存在）。如果列表不包含此元素，则列表不做改动。返回：如果列表包含指定的元素，则返回true
 *
 * public void clear()
 * 移除列表中的所有元素。此方法调用后，列表将为空
 *
 * public boolean addAll(Collection<? extends E> c)
 * 按照指定 collection 的迭代器所返回的元素顺序，将该 collection 中的所有元素添加到此列表的尾部。
 * 如果正在进行此操作时修改指定的 collection ，那么此操作的行为是不确定的。
 *（这意味着如果指定的 collection 是此列表且此列表是非空的，那么此调用的行为是不确定的）。
 *
 * public boolean addAll(int index,Collection<? extends E> c)
 * 从指定的位置开始，将指定 collection 中的所有元素插入到此列表中。
 *
 * public E get(int index)
 * 返回此列表中指定位置的元素
 *
 * public E set(int index,E element)
 * 用指定的元素替代此列表中指定位置上的元素
 *
 * public boolean isEmpty()
 * 如果此列表中没有元素，则返回true
 *
 * public int size()
 * 返回此列表中的元素数
 * */

public class Main {
    public static void main(String[] args) {

        //创建一个ArrayList集合对象arr
        ArrayList<String> arr = new ArrayList();
        ArrayList<String> arr1 = new ArrayList();
        System.out.println(arr);    //[]，说明重写了toString()方法
        int[] num = {1, 2, 3, 4};
        String[] str = {"1", "2", "3"};
        arr1.add("张三");
        arr1.add("李四");
        arr1.add("王五");
//        arr.addAll(num);
//        arr.addAll(str);
        arr.addAll(arr1);
        System.out.println(arr);
        for (String string : arr
        ) {
            System.out.println(string);
        }
        
        new RandomArrayList().storageStart();
    }
}
