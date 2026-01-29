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
public class JavaButton {
    public static void main(String[] args){
        JFrame f1 = new JFrame("Main Frame");
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setVisible(true);
        JLabel l1= new JLabel("Click the button");
        l1.setBounds(120,65,100,30);
        f1.add(l1);
        JButton b1 = new JButton("Click Me");
        b1.setBounds(120,100,100,50);
        f1.add(b1);
    }
}
