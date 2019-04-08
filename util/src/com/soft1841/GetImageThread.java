package com.soft1841;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class GetImageThread extends Object implements Runnable {
    @Override
    public void run() {
        while (true){
            try {
                URL url = new URL("http://pic75.nipic.com/file/20150821/9448607_145742365000_2.jpg");
                //打开链接
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                //设置请求方式为GET
                conn.setRequestMethod("GET");
                //超时响应时间为5s
                conn.setConnectTimeout(5*1000);
                //通过输入流获取图片数据
                InputStream inStream =conn.getInputStream();
                //得到图片的二进制数据，以二进制封装得到数据，具有通用性
                ByteArrayOutputStream out1 = new ByteArrayOutputStream();
                //准备缓冲字节数据
                byte[] buffer = new byte[1024];
                int len = 0;
                //每次读入一个缓冲区大小的字节数
                while ((len = inStream.read(buffer)) != -1){
                    out1.write(buffer,0,len);
                }
                inStream.close();
                //通过输出流获取到字节数组
                byte[] data = out1.toByteArray();
                //new一个文件对象用来保存图片，默认保存当前工程根目录
                File imageFile = new File("1.jpg");
                File imageFile1 = new File("D:/1.jpg");
                //创建输出流
                OutputStream out2 = new FileOutputStream(imageFile);
                OutputStream out3 = new FileOutputStream(imageFile1);
                //写入数据
                out2.write(data);
                out2.close();
                out3.write(data);
                out3.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main (String[] args) {
        GetImageThread getImageThread = new GetImageThread();
        getImageThread.run();
    }
}
