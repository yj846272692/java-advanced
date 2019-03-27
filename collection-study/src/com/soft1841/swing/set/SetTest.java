package com.soft1841.swing.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set接口基本程序
 * @author 杨晶
 * 2019.03.19
 */

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("A");
        System.out.println("直接输出set集合");
        System.out.println(set);

        //去重验证
//        String s1 = new String("A");
//        String s2 = new String("B");
//        String s3 = new String("C");
//        String s4 = new String("A");
//        set.add(s1);
//        set.add(s2);
//        set.add(s3);
//        set.add(s4);
//        System.out.println(set);


        //用for循环遍历set集合
        System.out.println("for循环遍历结果");
        for (int i =0 ,len = set.size();i<len;i++){
            System.out.println();
        }

        //用Iterator迭代器遍历set集合
        System.out.println("Iterator迭代器遍历结果");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        //用Lambda表达式遍历set集合
        set.forEach(str -> System.out.println(str + " "));



    }
}
