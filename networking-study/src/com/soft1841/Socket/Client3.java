package com.soft1841.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 服务器向客户端发送信息
 */

public class Client3 {
    public static void main(String[] args)  throws IOException {
        Socket client = new Socket("10.30.232.89",10086);
        System.out.println("成功连接服务器");
        //声明BufferedReader对象，通过客户端的输入流接受信息
        BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String str = buf.readLine();
        System.out.println("服务器输出内容："+ str);
        buf.close();
        client.close();


    }
}
