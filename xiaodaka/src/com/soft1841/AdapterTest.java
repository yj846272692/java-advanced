package com.soft1841;

public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("特长生招募中。。。");
        Student student1 = new Student() {
            @Override
            public void javaStudy() {
                System.out.println("我是一名JAVA大神");
            }
        };
        student1.javaStudy();
        Student student2 = new Student() {
            @Override
            public void mathStudy() {
                System.out.println("我数学学得好");
            }

            @Override
            public void playBasketball() {
                System.out.println("我篮球打得好");
            }

            @Override
            public void playFootball() {
                System.out.println("我足球踢得也好");
            }
        };
        student2.playFootball();
    }
}
