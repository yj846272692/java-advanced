package com.soft1841;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * 控制台读入一行字符串，通过流写入目标文件
 * @author 杨晶
 * 2019-03-26
 */

public class TxtTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String inputString = scanner.nextLine();
        char[] chars =  inputString.toCharArray();
        File destFile =  new File("E:/hello.txt");
        Writer out = new FileWriter(destFile);
        out.write(chars);
        out.close();
    }
}
