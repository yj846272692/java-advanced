package com.soft1841;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JFrame;
public class NowTime extends JFrame {
    //添加 显示时间的JTextField
    private void addComponent(){
        JTextField time = new JTextField();
        this.getContentPane().add(time);
        this.setTimer(time);
    }
    //显示窗口
    private void showTime(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setVisible(true);
    }
    //设置Timer 1000ms实现一次动作 实际是一个线程
    private void setTimer(JTextField time){
        final JTextField varTime = time;
        Timer timeAction = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long timemillis = System.currentTimeMillis();
                    //转换日期显示格式
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                varTime.setText(df.format(new Date(timemillis)));
            }
        });
        timeAction.start();
    }
    //运行方法
    public static void main(String[] args) {
        NowTime timeFrame = new NowTime();
        timeFrame.addComponent();
        timeFrame.showTime();
    }
}