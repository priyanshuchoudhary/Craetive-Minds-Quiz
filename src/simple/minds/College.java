
package simple.minds;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author choud
 */

public class Quiz extends JFrame{
    Quiz(){
        setBounds(40, 40, 1220, 620);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
// 
//        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Simple/minds/icons/quiz.png"));
//        JLabel l1= new Jlabel(i1);
//        l1.setBounds(0, 0, 1200, 300);
//        add(l1);


    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/quiz.png"));
    JLabel l1=new JLabel(i1);
    l1.setBounds(0, 0, 1220, 250);
    add(l1);
        
        JLabel qno=new JLabel("1.");
        qno.setBounds(100, 300, 40, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(qno);
        
        JLabel question=new JLabel("What is your college name ?");
        question.setBounds(140, 300, 350, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(question);
        
        JRadioButton opt1= new JRadioButton("Lakshmi narain College of Technology");
        opt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        opt1.setBounds(150,350,600,30);
        opt1.setBackground(Color.WHITE);
        add(opt1);
        
        JRadioButton opt2= new JRadioButton("Lakshmi Narain College of Technology and Science");
        opt2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        opt2.setBounds(150,400,600,30);
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        JRadioButton opt3= new JRadioButton("Lakshmi Narain College of Technology and Excellence");
        opt3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        opt3.setBounds(150,450,600,30);
        opt3.setBackground(Color.WHITE);
        add(opt3);
        
        JRadioButton opt4= new JRadioButton("Jai Narain College of Technology");
        opt4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        opt4.setBounds(150,500,600,30);
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        ButtonGroup options= new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        
        JButton next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 20));
        next.setBounds(950, 380, 200, 35);
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        add(next);
        
        JButton lifeline = new JButton("Elimination");
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lifeline.setBounds(950, 440, 200, 35);
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        add(lifeline);
        
        JButton submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        submit.setBounds(950, 500, 200, 35);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        add(submit);
         
        
        
        
    }
    public static void main(String[] args){
        new Quiz().setVisible(true);
        
    }
    
}
