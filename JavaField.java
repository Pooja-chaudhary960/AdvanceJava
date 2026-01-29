/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advancejava;
import javax.swing.*;

/**
 *
 * @author Acer
 */
public class JavaField {
    public static void main(String[] args)
    {
        JFrame f1 = new JFrame();
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setVisible(true);
        JTextField t1=new JTextField("User Name");
        t1.setBounds(50,100,100,30);
        f1.add(t1);
        JPasswordField p1=new JPasswordField();
        p1.setBounds(100,150,100,30);
        f1.add(p1);
        JTextArea ta1=new JTextArea();
        ta1.setBounds(100,200,100,60);
        f1.add(ta1);
        
        
    }
}
