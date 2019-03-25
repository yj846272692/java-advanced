package com.soft1841;
/**
 * 创建一个文件夹下循环十个文件夹
 * @author 杨晶
 * 2019.03.25
 */


import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        for( int i = 1;i<=10; i++){
            File folder = new File("D:/Java" + "/" + "chap" + i);
            folder.mkdirs();
        }
    }
}

