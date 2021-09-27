/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;
import javax.swing.JFrame;
 
public class DrawPolygons
{
// execute application 
    public static void main(String[] args)
    {
// create frame for Polygons JPanel 

        JFrame frame = new JFrame( "Drawing Polygons" );
         frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE);


        PolygonsJPanel polygonsJPanel = new PolygonsJPanel(); 
        frame.add( polygonsJPanel );// add polygons JPanel to frame 
        frame.setSize( 280, 27);// set frame size
        frame.setVisible( true); 
        // display frame 
} // end main
 } // end class DrawPolygons


