package com.soft1841.swing;

import java.io.*;
import java.util.UUID;

/**
 * 文件复制操作,将UUID作为新的文件名
 * @author 杨晶
 * 2019-03-26
 */

public class FileCopy {
    public static void main(String[] args) throws IOException {
        //指定源文件
        File srcFile =  new File("D:/code.jpg");
        String srcFileName = srcFile.getName();
        int position = srcFileName.indexOf(".");
        //取得源文件的拓展名
        String suffixName = srcFileName.substring(position + 1);
        //新的主文件名
        String newFile = UUID.randomUUID().toString();
        //指定目标文件
        File destFile = new File("E:/"+ newFile +"."+suffixName);
        //创建一个字节数组，大小为源文件大小
        byte[] bytes = new byte[(int) srcFile.length()] ;
        //创建字节输入流
        InputStream inputStream= new FileInputStream(srcFile);
        //将源文件读入字节数组
        inputStream.read(bytes);
        //创建字节输出流
        OutputStream outputStream = new FileOutputStream(destFile);
        //将字节数组输出到目标文件
        outputStream.write(bytes);
        //关闭输入输出流
        inputStream.close();
        outputStream.close();
    }
}
