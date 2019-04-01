package com.soft1841;


import java.io.*;

public class OutputTest {
    public static void main(String[] args) throws IOException {
        String str = "I Love Java!";
        //1.通过字节流输出
        File file1 = new File("E:/out1.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
        OutputStream outputStream = new FileOutputStream(file1);
        outputStream.write(str.getBytes());
        outputStream.close();


        //2.字符流输出
        File file2 = new File("E:/out2.txt");
        if (!file2.exists()){
            file2.createNewFile();
        }
        Writer writer = new FileWriter(file2);
        writer.write(str.toCharArray());
        writer.close();

        //3.打印流-包装流
        File file3 = new File("E:/out3.txt");
        if (!file3.exists()){
            file3.createNewFile();
        }
        OutputStream out = new FileOutputStream(file3);
        PrintStream printStream =  new PrintStream(out);
        printStream.print(str);
        printStream.close();





    }


}
