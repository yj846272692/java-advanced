package com.java.util.punchcard;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * @author 杨晶
 * 2019.03.13
 * 屏幕上随机两点之间的距离
 */

public class Distance {
    public static void main(String[] args) throws IOException {
        //指定图片的大小和类型
        BufferedImage bufferedImage = new BufferedImage(1024,768,BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics graphics = bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("宋体",Font.BOLD, 20);
        //画笔获取颜色，字体
        graphics.setColor(Color.LIGHT_GRAY);
        graphics.setFont(font);
        //画一个长为1024，宽为768的矩形
        graphics.fillRect(0,0,1024,768);
        //随机生成两个坐标
        Random random = new Random();
        int x1 = random.nextInt(1024);
        int x2 = random.nextInt(1024);
        int y1 = random.nextInt(768);
        int y2 = random.nextInt(768);
        //输出两点的横纵坐标
        System.out.println("p1:("+x1+","+y1+")");
        System.out.println("p2:("+x2+","+y2+")");
        //算出两点间距离，保留两位小数
        double distance = Math.sqrt((x1 + x2)*(x1 +x2)+(y1+y2)*(y1+y2));
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String s =decimalFormat.format(distance);
        //输出两点间距离
        System.out.println("----两点之间的距离 结果如下-----");
        System.out.println("两点之间的距离为：" + s);
        //画一条黑色的线，写上两点间的距离
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x1,y1,x2,y2);
        graphics.drawString(s,(x1+x2)/2,(y1+y2/2));
        //输出图片
        File file = new File("D:/Distance.jpg");
        //获取输出流
        OutputStream outputStream = new FileOutputStream(file);
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //关闭输出流
        outputStream.close();}

}
