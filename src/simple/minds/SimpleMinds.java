/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.minds;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleMinds extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1;
    
    
    
    SimpleMinds(){
    setBounds(200, 100, 900, 500);
    
    getContentPane().setBackground(Color.white);
    
    setLayout(null);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/Quiz2.jpg"));
    JLabel l1=new JLabel(i1);
    l1.setBounds(0, 0, 500, 450);
    add(l1);
    
    JLabel l2= new JLabel("Creative Minds");
    l2.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
    l2.setForeground(Color.blue);
    l2.setBounds(310, 40, 300, 30);
    add(l2);
    
    JLabel l3= new JLabel("Enter Your Name ");
    l3.setFont(new Font("Raleway",Font.BOLD,20));
    l3.setForeground(Color.black);
    l3.setBounds(520, 130, 300, 40);
    add(l3);
    
    t1= new JTextField();
    t1.setBounds(520,180,300,30);
    t1.setFont(new Font("Raleway",Font.BOLD,20));
    add(t1);
    
    // buttonss
    
    b1=new JButton("Rules");
    b1.setBounds(520, 230, 120, 25);
    b1.setBackground(Color.blue);
    b1.setForeground(Color.WHITE);
    b1.addActionListener(this);
    add(b1);
    
    b2=new JButton("Exit");
    b2.setBounds(700, 230, 120, 25);
    b2.setBackground(Color.blue);
    b2.setForeground(Color.WHITE);
    b2.addActionListener(this);
    add(b2);
    
    setVisible(true);
   
    }   
    
    public void actionListener(){
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name=t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            
            System.exit(0);
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new SimpleMinds();
        
    }
    
}
