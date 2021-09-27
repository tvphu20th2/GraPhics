/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acrsjpanel;
import javax.swing.JFrame;
/**
 *
 * @author tvphu
 */
public class DrawArcs 
{
    // execute application 

    /**
     *
     * @param args
     */
        public static void main( String[] args )
    {
        // create frame for Arcs JPanel 
        JFrame frame = new JFrame("Drawing Arcs" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArcsJPanel arcsJPanel = new ArcsJPanel();// create Arcs JPanel
        frame.add( arcsJPanel ); // add arcs JPanel to frame 
        frame.setSize( 300, 210);// set frame size
        frame.setVisible(true);// display frame
    } 
// end main 
} // end class DrawArcs


