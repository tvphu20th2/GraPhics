/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics.pkg2d;

import javax.swing.JFrame;

/**
 *
 * @author tvphu
 */
public class Shape2 {
    public static void main(String[] args){
// create frame for Shapes JPanel
        JFrame frame = new JFrame("Drawing 2D Shapes" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       Shapes2JPanel shapes2JPanel = new Shapes2JPanel();
        frame.add( shapes2JPanel );// add shapes JPanel to frame

        
        frame.setBackground( Color.WHITE);// set frame background color
        
        frame.setSize( 315, 330); // set frame size
       
       frame.setVisible(true); // display frame
        
 }
}
