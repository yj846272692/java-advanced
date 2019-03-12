package com.java.util;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入数字：");
        while(scanner.hasNext()){
            String s=scanner.nextLine().substring(2);
            char [] ch=s.toCharArray();
            int len=s.length();
            int num=0;
            int j=0;
            for(int i=len-1;i>=0;i--){
                int temp= 0;
                if(ch[i]>='A' && ch[i]<='F'){
                    temp=ch[i]-55;
                }else{
                    temp=ch[i]-48;
                }
                num+=temp*Math.pow(16, j++);
            }
            System.out.println("转换结果为："+num);
        }
    }
}
