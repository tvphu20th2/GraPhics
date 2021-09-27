/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author tvphu
 */
public class ColorJPanel extends JPanel {

     @Override
     public void paintComponent(Graphics g)
        {
             super.paintComponent( g); //call superclass paintComponent
        this.setBackground(Color.WHITE);
        
        // set new drawing color using integers
        g.setColor( new Color(255,0,0));
        g.fillRect(15, 25,100, 20);
        g.drawString("Curent RGB :"+g.getColor(),130,40);
        
        // set new drawing color using float
         g.setColor( new Color(0.50f,0.75f,0.0f));
        g.fillRect(15, 50,100, 20);
        g.drawString("Curent RGB :"+g.getColor(),130,65);
        
         // set new drawing color using static Color objects
         g.setColor( Color.BLUE);
        g.fillRect(15, 100,100, 20);
        g.drawString("Curent RGB :"+g.getColor(),130,90);
        
        // display individual RGB values
         Color color =Color.MAGENTA;
         g.setColor( color);
         g.fillRect(15, 100,100, 20);
         g.drawString(" RGB values :"+ color.getRed()+", "+
                color.getGreen()+ ", "+color.getBlue(),130,115);
      }
}
     
         
