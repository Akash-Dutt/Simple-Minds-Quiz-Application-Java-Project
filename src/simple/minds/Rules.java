
package simple.minds;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        //Frame Making
        setBounds(400,100,800,650);
        getContentPane().setBackground(Color.LIGHT_GRAY);   //To set frame background as LightGray
        setLayout(null);
        
        //Label
        JLabel l1 = new JLabel("Welcome " + username + " to Simple Minds");
        l1.setForeground(new Color(255,102,0)); 
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(50,20,700,30);
        add(l1);
        
        //Label for Rules
        JLabel l2 = new JLabel("");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l2.setBounds(20,90,610,370);
        l2.setText(
                "<html>"+
                    "1. Only solo entries are eligible" + "<br><br>" +
                    "2. The decision of the Simple Minds quiz will be final and will not be subjected to any change" + "<br><br>" +
                    "3. The participant shall not be allowed to use mobile and smartwatches" + "<br><br>" +
                    "4. The questions shall be in the form of multiple choice objective type questions" + "<br><br>" +
                    "5. Audience/Supporters shall not give any hints or clues to the participant" + "<br><br>" +
                    "6. The participant would be given a set of question paper containing 10 MCQ " + "<br><br>" +
                    "7. For each question there will be 4 options, out of which only 1 is true" + "<br><br>" +
                    "8. There is a time limit of 15 seconds for each question" + "<br><br>" +
                    "9. Participant will get 10 marks for correct answer and no negative marks for wrong answer" + "<br><br>" +
                    "10. There will be a 50-50 lifeline means out of four options, 2 wrong answers will be wiped out" + "<br><br>" +
                    "11. 50-50 Lifeline can be used only once in this quiz" + "<br><br>" +
                "<html>"
                );
        add(l2);
        
        // Back Button 
        b1 = new JButton("Back");
        b1.setBounds(250, 500, 100, 30);
        b1.setBackground(new Color(255,102,0));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        // Start Button
        b2 = new JButton("Start");
        b2.setBounds(400, 500, 100, 30);
        b2.setBackground(new Color(255,102,0));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource()== b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
        
    }

public static void main(String[] args) {
        new Rules("");
        
    }
    
}