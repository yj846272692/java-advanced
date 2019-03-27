package com.soft1841.swing.list;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"Java从入门到精通",69.8));
        list.add(new Book(2,"PHP项目开发实战入门",35.6));
        list.add(new Book(3,"C语言项目开发实战入门",70.5));
        System.out.println("直接输出结果：");
        System.out.println(list);
        //使用add方法
        System.out.println("使用add方法后");
        list.add(1,new Book(1,"Java项目开发实战入门",76.3));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        //使用set方法
        System.out.println("使用set方法：");
        list.set(1,new Book(1,"Java项目开发实战入门",76.3));
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(new Book(1,"Java项目开发实战入门",76.3));
        System.out.println(list);
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf("Java项目开发实战入门"));

    }
}
