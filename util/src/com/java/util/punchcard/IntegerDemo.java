package com.java.util.punchcard;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Integer类的练习
 * @author 杨晶
 * 2019.03.12
 */

public class IntegerDemo {
    public static void main(String[] args) {
        //调用Integer类的方法，将num进行进制转换
    int num = Integer.parseInt("456");
    Integer iNum =  Integer.valueOf("456");
        System.out.println("int数据与Integer对象的比较：" +iNum.equals(num));
        //二进制
        String str2 = Integer.toBinaryString(num);
        //十六进制
        String str3 = Integer.toHexString(num);
        //八进制
        String str4 = Integer.toOctalString(num);
        System.out.println("二进制：" + str2);
        System.out.println("十六进制：" +str3);
        System.out.println("八进制："+str4);
        System.out.println("-----------分割线，以下是自定义方法-----------");
        System.out.println("转换为7进制数："+ convert(num,7));
    }

    private static String convert(int num ,int radix){
        //创建一个StringBuffer，用来存放结果字符串
        StringBuffer stringBuffer = new StringBuffer();
        //循环除，直到商为0
        while (num != 0){
            //求出余数
            int remainder = num % radix;
            //将余数加入StringBuffer
            stringBuffer.append(String.valueOf(remainder));
            //更新被除数为商
            num  = num/radix ;
        }
        //将结果串取反返回
        return  stringBuffer.reverse().toString();

    }
}
