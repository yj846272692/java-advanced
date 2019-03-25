package com.java.util.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 流式布局拓展训练
 * @author 杨晶
 * 2019.03.25
 */

public class FlowLayoutPositionTest extends JFrame {
    public FlowLayoutPositionTest() {
        setTitle("流布局的使用");
        Container container = getContentPane();
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel jLabel = new JLabel("下面四句诗，哪一个是描写夏天的？");
        container.add(jLabel);
        JLabel jLabel2= new JLabel("A.秋风萧瑟天气凉，树木摇荡露为霜。");
        container.add(jLabel2);
        JLabel jLabel3 = new JLabel("B.白雪纷纷何所似，撒盐空中差可似。");
        container.add(jLabel3);
        JLabel jLabel4 = new JLabel("C.接天莲叶无穷碧，映日荷花别样红。");
        container.add(jLabel4);
        JLabel jLabel5 = new JLabel("D.竹外桃花两三枝，春江水暖鸭先知。");
        container.add(jLabel5);
        setSize(300,280);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args)
    {
        new FlowLayoutPositionTest();
    }
}
