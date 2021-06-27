/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package simple.minds;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    Score(String username,int score){
        setBounds(300, 130, 750, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/Answers.jpg"));
        JLabel l1= new JLabel(i1);
        
        // Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        // ImageIcon i3= new ImageIcon(i2);
        
        l1.setBounds(230, 10, 300, 250);
        add(l1);
        
        JLabel l2= new JLabel("Your response has been recorded.");
        l2.setBounds(180, 250, 700, 30);
        l2.setFont(new Font("Raleway",Font.PLAIN,26));
        add(l2);
        
        JLabel l3= new JLabel("Thank you your Score is : "+score);
//        JLabel l3= new JLabel("Thank you "+username+" your Score is : "+score);
        
        l3.setBounds(230, 300, 700, 30);
        l3.setFont(new Font("Raleway",Font.PLAIN,26));
        l3.setForeground(Color.green);
        add(l3);;
        
        JButton  b1= new JButton("Attempt Again");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(280, 350, 200, 30);
        add(b1);
        
        
        
        
    }

//    Score(String username, int score) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(true);
        new SimpleMinds().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0 ).setVisible(true);
    }

    //@Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
