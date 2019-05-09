package com.soft1841;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        /**
         * 接受客户端信息
         */
        //1，创建服务器端DatagramSocket，指定端口
        DatagramSocket socket = new DatagramSocket(10086);
        //2，创建数据报，用于接收客户端发送的数据
        byte[] data = new byte[1024];//创建字节数组，指定接收的数据包的大小
        DatagramPacket datagramPacket = new DatagramPacket(data,data.length);
        //3，接收客户端发送的数据
        System.out.println("****服务器端已启动，等待客户端发送数据");
        socket.receive(datagramPacket);//此方法在接收到数据报之前会一直堵塞
        //4，读取数据
        String info = new String(data,0,datagramPacket.getLength());
        System.out.println("我是服务器，客户端说："+info);
        /**
         * 向客户端响应数据
         */
        //1.定义客户端的地址，端口号，数据
        InetAddress address = datagramPacket.getAddress();
        int port  = datagramPacket.getPort();
        byte[] data2 = "欢迎您！".getBytes();
        //2.创建数据报，包含响应的数据信息
        DatagramPacket datagramPacket2 = new DatagramPacket(data2,data2.length,address,port);
        //3.响应客户端
        socket.send(datagramPacket2);
        //4.关闭资源
        socket.close();
    }
}
