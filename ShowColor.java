/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;
import javax.swing.JFrame;
/**
 *
 * @author tvphu
 */
public class ShowColor {
        public static void main(String[] args)
        {
            JFrame frame = new JFrame("using colors");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            ColorJPanel colorJPanel =new ColorJPanel(); // create JPanel
            frame.add(colorJPanel);// add colorJPanel to frame
            frame.setSize(400,180);// set frame
            frame.setVisible(true);//display frame
        }// kết thúc hàm main
        
    
}//kết thúc Class
