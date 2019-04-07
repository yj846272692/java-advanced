package com.soft1841;

public class RunnableTest extends Object implements Runnable {
    private int count = 10;
    @Override
    public void run() {
        while (true){
            System.out.print(count+" ");
            //使count变量自减，当自减为0时，退出循环
            if (--count == 0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        //启动线程
        test.start();
    }
}
