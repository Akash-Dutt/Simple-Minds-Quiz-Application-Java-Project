
package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMinds extends JFrame implements ActionListener {

    JButton b1, b2;  //Global Declaration
    JTextField t1;   //Global Declaration
    //Constructor Call    
    SimpleMinds(){
        
        // Frame making
        setBounds(200,150,1200,500);    //dleft, Dup, length, height   //setting dimensions of the frame w.r.t window size
        getContentPane().setBackground(Color.LIGHT_GRAY);   //To set frame background as Light Gray
        setLayout(null);   //for custom layout 
        
        //importing Image as label l1
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/login.png"));    //image import
        JLabel l1 = new JLabel(i1); //we cannot put image directly on the frame so I first add image to label 
        l1.setBounds(0,0,600,500);    //dleft, Dup, length, height    //setting dimensions of the image w.r.t frame
        add(l1);
        
        //Importing Label l2
        JLabel l2 = new JLabel("Simple Minds");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        l2.setForeground(new Color(255,102,0)); //Dark-Orange color 255-102-0
        l2.setBounds(750,60,300,45);
        add(l2);
        
        //Importing Label l3
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l3.setForeground(Color.DARK_GRAY);
        l3.setBounds(810,160,300,20);
        add(l3);
        
        //Importing TextField for Entering Name
        t1 = new JTextField();
        t1.setBounds(735, 200, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
        //Adding "Rules" Button to the login frame
        b1 = new JButton("Rules");
        b1.setBounds(735, 270, 120, 25);
        b1.setBackground(new Color(255,102,0)); //Dark Orange color 255-102-0
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        //Adding "Exit" Button to the login frame
        b2 = new JButton("Exit");
        b2.setBounds(915, 270, 120, 25);
        b2.setBackground(new Color(255,102,0));  //Dark Orange color 255-102-0
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    //overriding 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();     //getText() function is in Swing package
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }
    
    
    public static void main(String[] args) {
        new SimpleMinds();
        
    }
    
}
