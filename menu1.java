package cse558;
import java.awt.*;  
class menu1
{  
     menu1(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("CSE");  
         MenuItem submenu4=new MenuItem("Fourth year");
         Menu submenu1=new Menu("First year");
         MenuItem submenu2=new MenuItem("Second year");
         MenuItem submenu3=new MenuItem("Third year"); 
         MenuItem i4=new MenuItem("A section");  
         MenuItem i5=new MenuItem("B section");  
         MenuItem i6=new MenuItem("C section");  
         
         submenu1.add(i4);  
         submenu1.add(i5); 
         submenu1.add(i6);
        
         menu.add(submenu1);  
         menu.add(submenu2); 
         menu.add(submenu3); 
         menu.add(submenu4); 
         mb.add(menu);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}  
public static void main(String args[])  
{  
new menu1();  
}  
}  
