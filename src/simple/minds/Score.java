package simple.minds;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
        //frame making
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //importing image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);
        
        //
        JLabel l2 = new JLabel("Thankyou " + username + " for playing Simple Minds");
        l2.setBounds(45, 30, 700, 30);
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 26));
        l2.setForeground(Color.DARK_GRAY);
        add(l2);
        
        //
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(255, 102, 0));
        add(l3);
        
        //
        JButton b1 = new JButton("Play Again");
        b1.setBackground(new Color(255, 102, 0));
        b1.setForeground(Color.WHITE);
        b1.setBounds(400, 270, 120, 30);
        b1.addActionListener(this);
        add(b1);   
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new SimpleMinds().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}
