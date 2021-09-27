/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linereactoval;
 import java.awt.Color; 
import javax.swing.JFrame;

/**
 *
 * @author tvphu
 */
public class LineReactOval {
     public static void main(String[] args){
// create frame for LinesRectsOvals JPanel 
        JFrame frame =new JFrame("Drawing lines, rectangles and ovals" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LinesRectsOvalsJPanel linesRectsOvalsJPanel =
        new LinesRectsOvalsJPanel();
        linesRectsOvalsJPanel.setBackground (Color. WHITE);
        frame.add( linesRectsOvalsJPanel ); // add panel to frame
        frame.setSize(400, 210 ); // set frame size
        frame.setVisible(true); // display frame } // end main } // end class LinesRectsOvals

}
}
