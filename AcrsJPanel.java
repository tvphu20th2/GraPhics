/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acrsjpanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author tvphu
 */
public class AcrsJPanel extends JPanel  {
    @Override
    public void paintComponent( Graphics g){
        
          super.paintComponent( g );
          
        // start at 0 and sweep 360 degrees 
        g.setColor(Color.RED ); 
        g. drawRect( 25, 40, 90, 180);
        g.setColor(Color.BLACK ); 
        g.drawArc (35, 45, 180, 180, 0, 360 ) ;

        // start at 0 and sweep 110 degrees
         g.setColor(Color. RED ); 
        g.drawRect( 120, 40, 90, 85); 
        g.setColor (Color.BLACK); 
        g.drawArc(50, 45, 90, 90, 0, 100 ) ;

        // start at 0 and sweep -270 degrees 
        g.setColor(Color.RED); 
        g.drawRect( 170, 37, 90, 90); 
        g.setColor(Color.BLACK); 
        g.drawArc( 165, 45, 50, 70, 0, -270 ) ;
        
        // start at o and sweep 360 degrees 
        g.fillArc( 25, 110, 90, 50, 0, 270 ) ;

        // start at 270 and sweep - 90 degrees 
        g.fillArc( 100, 115, 90, 75, 360, -180 ) ;
        
        // start at 0 and sweep -270 degrees
        g.fillArc( 185, 120, 80, 40, 0, -270); 
        
} // end method paintComponent
 } // end class Arcs JPanel





      
       