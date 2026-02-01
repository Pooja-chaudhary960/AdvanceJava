/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advancejava;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Acer
 */
public class JavaTree {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Main Frame");
        f.setSize(400, 400);
        f.setVisible(true);
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
        DefaultMutableTreeNode yellow = new DefaultMutableTreeNode("yellow");
        color.add(red);
        color.add(blue);
        color.add(green);
        color.add(yellow);
       
        JTree jt = new JTree(style);
        f.add(jt);
    }
}
