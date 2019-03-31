package com.soft1841;

import java.io.*;

/**
 * 控制台读入一行字符串，通过流写入目标文件
 */

public class ClassTest {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/hello.txt");
        //用文件的对象创建文件写入流
        FileWriter fw = new FileWriter(file);
        //创建缓冲写入流
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("请输入你要写的信息 ：");
        //将从控制台输入的字节流信息转换成字符流
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        while (!str.equals("#")) {
            //将控制台的内容写入到文件中
            bw.write(str);
            //换行
            bw.newLine();
            //清空信息
            bw.flush();
            //接着读取一行信息
            str=br.readLine();
        }
            br.close();
            isr.close();
            bw.close();
            fw.close();

    }
}
