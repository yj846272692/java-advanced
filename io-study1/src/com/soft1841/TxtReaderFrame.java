package com.soft1841;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * txt文件阅读器窗体
 * @author 杨晶
 * 2019-04-01
 */

public class TxtReaderFrame  extends JFrame implements ActionListener {
    private  JTextField inputField;
    private  JButton confirmButton;
    private JPanel topPanel;
    private JTextArea contentArea;

    public TxtReaderFrame(){
        init();
        setTitle("图片阅读窗体");
        setSize(640,480);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public  void  init(){
        //顶部面板
        inputField = new JTextField(20);
        inputField.setPreferredSize(new Dimension(150,40));
        confirmButton = new JButton("确认");
        confirmButton.setPreferredSize(new Dimension(100,40));
        topPanel = new JPanel();
        topPanel.add(inputField);
        topPanel.add(confirmButton);
        //给按钮注册监听
        confirmButton.addActionListener(this);
        add(topPanel, BorderLayout.NORTH);
        //中间的多行文本域
        contentArea = new JTextArea();
        add(contentArea,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new TxtReaderFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       //获取输入框内容
        String filePath = inputField.getText().trim();
        //创建文件
        File file =  new File(filePath);
        //使用三种方法将file中的内容读入
        try {
            InputStream inputStream =  new FileInputStream(file);
            byte[] bytes =  new byte[(int) file.length()];
            //读入内容，到字节数组
            inputStream.read(bytes);
            //使用bytes构建一个新的输出字符串
            String resultStr = new String(bytes);
            contentArea.append(resultStr);
            //追加换行
            contentArea.append("\r\n");
        } catch (IOException e1) {
            JOptionPane.showMessageDialog(null,"IO操作异常");
        }
    }
}
