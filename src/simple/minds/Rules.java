/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.minds;

/**
 *
 * @author choud
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    JButton b1,b2;
    String username;
    
    Rules(String username) {
        this.username=username;
        setBounds(300, 100, 700, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel l1 = new JLabel("Welcome " + username + " to Creative Minds");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Raleway", Font.BOLD, 26));
        l1.setBounds(50, 20, 700, 30);
        add(l1);

        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahome", Font.BOLD, 18));
        l2.setBounds(50, 90, 600, 350);

        l2.setText(
                "<html>"
                + "1.The quiz will be of half an hour duration." + "<br><br>"
                + "2. The quiz will be open all of 22nd March, from 0900 Hrs." + "<br><br>"
                + "3. You can attempt the quiz only once." + "<br><br>"
                + "4. There are a total 50 questions." + "<br><br>"
                + "5. Each question carries one mark. No negative marking for wrong answers." + "<br><br>"
                + "6. Questions are of Multiple Choice." + "<br><br>"
                + "<html>"
        );

        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(150, 425, 100, 30);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(350, 425, 100, 30);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            
            // when we press back button the old window should get closed.
            
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
            
        }else if(ae.getSource()==b2){
            this.setVisible(false);
            // for when we pressss start button new frame
            new Quiz("").setVisible(true);
            
            
        }
            
    }

    public static void main(String[] args) {
        new Rules("");

    }

}
