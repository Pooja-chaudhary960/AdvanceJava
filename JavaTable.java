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
public class JavaTable {
     public static void main(String[] args)
    {
        JFrame f1 = new JFrame();
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
        String columns[] = {"ID", "Name", "Salary"};
        String data[][] = {{"101","Ram","50000"},{"102","Sita","60000"},{"103","Hari","70000"}};
        JTable tb1 = new JTable(data, columns);
        tb1.setBounds(50,70,300,400);
        f1.add(tb1);
    }
}
