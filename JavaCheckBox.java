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
public class JavaCheckBox {
     public static void main(String[] args)
    {
        JFrame f1 = new JFrame();
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
        JLabel l1 = new JLabel("Which one is your favourite language?");
        l1.setBounds(50,30,300,30);
        f1.add(l1);
        JCheckBox checkBox1= new JCheckBox("C++");
        checkBox1.setBounds(50,60,60,30);
        f1.add(checkBox1);
        
        JRadioButton rb1= new JRadioButton("Python");
        rb1.setBounds(50,60,60,30);
        f1.add(rb1);
        
        JRadioButton rb2= new JRadioButton("JavaScript");
        rb2.setBounds(50,150,100,30);
        f1.add(rb2);
        
        String data[] = {"C++","Python","JavaScript","Java"};
        JComboBox comboBox1 = new JComboBox(data);
        comboBox1.setBounds(50,180,100,30);
        f1.add(comboBox1);
              
       
    }
    
}
