package com.soft1841;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TraficLights extends JFrame {
    private JPanel contenPanel;
    private JPanel bgPanel;
    private JLabel bgLabel;
    public TraficLights(){
        init();
        setTitle("红绿灯");
        setLocationRelativeTo(null);//窗体自动居中
        setSize(200,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        //内容面板
        contenPanel = new JPanel();
        contenPanel.setBackground(Color.BLACK);
        contenPanel.setBorder(new EmptyBorder(5,5,5,5));
        contenPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        setContentPane(contenPanel);
        //图片面板
        bgPanel = new JPanel();
        bgPanel.setBackground(Color.BLUE);
        contenPanel.add(bgPanel);
        bgPanel.setLayout(new BorderLayout(0,0));
        //标签
        bgLabel = new JLabel();
        bgLabel.setBackground(Color.GREEN);
        bgLabel.setIcon(new ImageIcon(TitledBorder.class.getResource("/img/Green.jpg")));
        bgPanel.add(bgLabel,BorderLayout.CENTER);

        TurnColor tc = new TurnColor();
        tc.setBgLabel(bgLabel);
        tc.start();

    }
    public static void main(String[] args) {
        TraficLights frame = new TraficLights();
        frame.setVisible(true);
    }
}
