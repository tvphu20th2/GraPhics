/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;
import graphics.Graphics.ShapesJPanel;
import java.awt.Color;
 import javax.swing.JFrame;

/**
 *
 * @author tvphu
 */
public class Shape {
    // Fig. 15.32: Shapes2.java
 // Demonstrating a general path. 

// execute application
 public static void main(String[] args){
// create frame for Shapes JPanel
        JFrame frame = new JFrame("Drawing 2D Shapes" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ShapesJPanel shapesJPanel = new ShapesJPanel();
        frame.add( shapesJPanel );

        // add shapes JPanel to frame frame.setBackground Color.WHITE);
        // set frame background color frame.setSize( 315, 330); 
       // set frame size
       frame.setVisible(true);
        // display frame 
 }
        // end main 
}
        // end class Shapes 2


