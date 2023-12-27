package cse558;
import javax.swing.*;  
import java.awt.*;  
public class FL1 {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("FlowLayout Example");  
        frame.setLayout(new FlowLayout());  
        frame.add(new JButton("Sunday"));  
        frame.add(new JButton("Monday"));  
        frame.add(new JButton("Tuesday")); 
        frame.add(new JButton("Wednesday"));
        frame.add(new JButton("Thursday"));
        frame.add(new JButton("Friday"));
        frame.add(new JButton("Saturday"));
        frame.pack();
        frame.setSize(200,200);
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
}  
