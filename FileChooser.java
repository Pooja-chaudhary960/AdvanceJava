/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advancejava;
import java.awt.*;
import javax.swing.*;
//import javax.swing.filechooser.*;

/**
 *
 * @author Acer
 */
public class FileChooser {
    public static void main(String[] args)
    {
        //JFileChooser jf = new JFileChooser("C:");
        //jf.showSaveDialog(null);
        
        JFrame f = new JFrame("Main");
        f.setSize(400,400);
        f.setVisible(true);
        Image icon = Toolkit.getDefaultToolkit().getImage("E:\\PHOTO");
        f.setIconImage(icon);
    }
}
