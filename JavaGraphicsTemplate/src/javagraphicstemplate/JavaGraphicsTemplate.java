/**************************************************
* PROGRAM: ADT and Sort Interactive 
* NAME:Jonathan Chen 
* Date: June 1st, 2019
* Description:Animate the various ADT's and sorts so people can understand how they work 
* Version:0.9
*****************************************************/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagraphicstemplate;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.Color;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import sun.audio.*;
import java.net.URL;


public class JavaGraphicsTemplate extends JApplet {
   
        
   
        public static void main(String[] a) {
            JFrame window = new JFrame();
            window.setSize(1000,1000);
            window.setBackground(Color.BLUE);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
            window.getContentPane().add(new MyAppClass());
            window.setVisible(true);
            
        }
}
