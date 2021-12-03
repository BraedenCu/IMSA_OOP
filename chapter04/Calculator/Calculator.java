import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
//24 keys on your calculator atleast 

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator extends JFrame
{
    //for calculator
    String s1 = "";
    String s2 = "";
    boolean digit1 = false;
    boolean digit2 = false;
    float solution;
    boolean power;
    boolean multiply;
    boolean add;
    boolean subtract;
    boolean divide;
    
    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {

        JFrame frame = new JFrame ("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(0, 6, 2, 2));
        
        JTextField f = new JTextField();
        f.setHorizontalAlignment(JTextField.RIGHT);
        p.add(f, BorderLayout.NORTH);
        
        
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7= new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton ba = new JButton("+");
        JButton bs = new JButton("-");
        JButton bd = new JButton("/");
        JButton bm = new JButton("x");
        JButton be = new JButton("=");
        JButton c = new JButton("C"); //clear
        
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b0);
        p.add(ba);
        p.add(bs);
        p.add(bd);
        p.add(bm);
        p.add(be);
        p.add(c);
        
        //JLabel label1 = new JLabel ("Question authority,"); 
        //JLabel label2 = new JLabel ("but raise your hand first."); 
     
        p.setBackground(Color.yellow);
        p.setPreferredSize(new Dimension(500, 500));
        //p.add (label1); 
        //p.add (label2); 
        
        b1.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    s1+="1";
                    f.setText(f.getText()+"1");
                }
            }
        );
        b2.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    s1+="2";
                    f.setText(f.getText()+"2");
                }
            }
        );
        b3.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    s1+="3";
                    f.setText(f.getText()+"3");
                }
            }
        );
        b4.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    s1+="4";
                    f.setText(f.getText()+"4");
                }
            }
        );
        b5.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    s1+="5";
                    f.setText(f.getText()+"5");
                }
            }
        );
        b6.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    s1+="6";
                    f.setText(f.getText()+"6");
                }
            }
        );
        b7.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    s1+="7";
                    f.setText(f.getText()+"7");
                }
            }
        );
        b8.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    s1+="8";
                    f.setText(f.getText()+"8");
                }
            }
        );
        b9.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    s1+="9";
                    f.setText(f.getText()+"9");
                }
            }
        );
        b0.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    s1+="0";
                    f.setText(f.getText()+"0");
                }
            }
        );
        ba.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    add = true;
                    operationHelper();
                    f.setText(f.getText()+" + ");
                }
            }
        );
        bs.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    operationHelper();
                    subtract = true;
                    f.setText(f.getText()+" - ");
                }
            }
        );
        bm.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    operationHelper();
                    multiply = true;
                    f.setText(f.getText()+" * ");
                }
            }
        );
        bd.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    operationHelper();
                    divide = true;
                    f.setText(f.getText()+" / ");
                }
            }
        );
        
        be.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    //perform calculations on string expression using java builtin evaluator
                    System.out.println("TEST");
                    System.out.println(s1);
                    System.out.println("TEST");
                    System.out.println(s2);
                    if (divide) {
                        f.setText("" + (Integer.parseInt(s1) / Integer.parseInt(s2)));
                    }
                    divide = false;
                    add = false;
                    subtract = false;
                    power = false;
                    multiply = false;
                }
            }
        );
        
        frame.getContentPane().add(p); 
        frame.pack(); 
        frame.setVisible(true); 

        //assembleCalculator();
    }
    
    public void numberHelper(int number) {
        //button helper class
        if (!digit1) {
            s1+=("" + number);
        }
        else {
            s2+=("" + number);
        }
    }
    
    public void operationHelper() {
        digit1 = true;
        
    }

    
    
    
    
    
    
    
    
    
    public void assembleCalculator() {
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        JTextField f = new JTextField();
        f.setHorizontalAlignment(JTextField.RIGHT);
        add(f, BorderLayout.NORTH);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton ba = new JButton("+");
        JButton be = new JButton("=");
        JButton c = new JButton("C"); //clear
        p.setLayout(new GridLayout(0, 6, 2, 2));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(ba);
        p.add(be);
        p.add(c);
        add(f, BorderLayout.CENTER);
        //pack();
        //setVisible(true);
        b1.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    f.setText(f.getText()+"1");
                }
            }
        );
        
        pack();
        setVisible(true);
        
        /*
        c.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    f.setText("");
                }
            
            }
        );
        */
    }
}
