package com.soft1841.swing.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * comparable接口的练习
 * @author 杨晶
 * 2019.03.20
 */

public class BookTest {
    public static void main(String[] args) {
        //创建List对象，存入对象
        List<Book> list = new ArrayList<>();
        list.add(new Book("老人与海",56));
        list.add(new Book("骆驼祥子",35));
        list.add(new Book("围城",60));
        //调用Collection的sort方法，会自动调用之前写的compareTo方法进行排序
        Collections.sort(list);
        //forEach遍历list
        for (Book book : list) {
            System.out.println("名称：" + book.getName() + ",价格：" + book.getPrice());

        }

    }
}
