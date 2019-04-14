package com.soft1841;

import javax.swing.*;

public class TurnColor extends Thread  {
    private JLabel bgLabel;
    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }
    @Override
    public void run() {
        while (true) { // 线程始终处于被启用状态
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Yellow.jpg"))); // 黄灯
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Red.jpg"))); // 红灯
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Green.jpg"))); // 绿灯
        }
    }
}
