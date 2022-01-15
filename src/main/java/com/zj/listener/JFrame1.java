package com.zj.listener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JFrame1 extends JFrame{
    public static void main(String[] args) {
        JFrame1 jFrame1 = new JFrame1();
        jFrame1.setSize(300, 200);
        jFrame1.setLocation(200, 200);
        jFrame1.setLayout(new FlowLayout());
        jFrame1.setDefaultCloseOperation(JFrame1.EXIT_ON_CLOSE);
        JButton btn = new JButton("确定");
        jFrame1.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("hello");
            }
        });
        jFrame1.setVisible(true);
    }
}