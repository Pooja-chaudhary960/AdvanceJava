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
public class JavaMenuBar {
    public static void main(String[] args)
    {
        JFrame f1 = new JFrame();
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
        JMenuBar mb = new JMenuBar();
        JMenu menu, submenu;
        JMenuItem i1,i2,i3,i4,i5;
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("Item1");
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");
        i4 = new JMenuItem("Item4");
        i5 = new JMenuItem("Item5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        mb.add(menu);
        f1.setJMenuBar(mb);
    }
}
