package com.soft1841.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //使用TreeSet创建Set集合对象
        Set<Integer> set = new TreeSet<>();
        //向Set集合中添加元素
        set.add(-5);
        set.add(-7);
        set.add(10);
        set.add(6);
        set.add(3);
        //创建Iterator迭代器对象
        Iterator<Integer> iterator = set.iterator();
        //提示信息
        System.out.println("Set集合中的元素：");
        //遍历并输出Set集合中的元素
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "   ");
        }

    }
}
