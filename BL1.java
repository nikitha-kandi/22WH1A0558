package cse558;
import java.awt.*;    
import javax.swing.*;    
    
public class BL1  
{    
JFrame f;    
BL1()  
{    
    f = new JFrame();    
        
     // creating buttons  
    JButton b1 = new JButton("Top");; // the button will be labeled as NORTH   
    JButton b2 = new JButton("Bottom");; // the button will be labeled as SOUTH  
    JButton b3 = new JButton("Rightside");; // the button will be labeled as EAST  
    JButton b4 = new JButton("Leftside");; // the button will be labeled as WEST  
    JButton b5 = new JButton("Direction");;// the button will be labeled as CENTER
    
    f.setLayout(new BorderLayout(20,20));    
    f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
    f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
    f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
    f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
    f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
        
    f.setSize(300, 300);    
    f.setVisible(true);    
}    
public static void main(String[] args) {    
    new BL1();    
}    
}    
