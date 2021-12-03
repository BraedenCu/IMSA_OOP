import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * calculator in java :))))
 * @author (braeden)
 * @version (11/18/21)
 */
class calculate extends JFrame
{
    String s1 = "";
    String s2 = "";
    boolean digit1 = false;
    boolean digit2 = false;
    float solution;
    boolean subtract;
    boolean multiply;
    boolean divide;
    boolean power;
    boolean add;
    

    public calculate() 
    {
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        JTextField f = new JTextField();
        f.setHorizontalAlignment(JTextField.RIGHT);
        
        Font bigFont = f.getFont().deriveFont(Font.PLAIN, 150f);
        f.setFont(bigFont);
        
        add(f,BorderLayout.NORTH);
        
        JButton pi = new JButton("π");
        JButton ba = new JButton("+");
        JButton bs = new JButton("-");
        JButton bd = new JButton("/");
        JButton bm = new JButton("*");
        JButton bpow = new JButton("^");
        JButton sin = new JButton("sin");
        JButton cos = new JButton("cos");
        JButton tan = new JButton("tan");
        JButton bdott = new JButton(".");
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        
        JButton equals = new JButton("=");
        JButton clear = new JButton("Clear");
        
        panel.setLayout(new GridLayout(0,8,2,2));
        panel.setBackground(Color.blue);
        panel.setPreferredSize(new Dimension(500, 500));
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
        panel.add(pi);
        panel.add(ba);
        panel.add(bs);
        panel.add(bd);
        panel.add(bm);
        
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        
        panel.add(equals);
        panel.add(bpow);
        panel.add(bdott);
        panel.add(sin);
        panel.add(cos);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b0);
        
        panel.add(tan);
        panel.add(clear);
        
        
        add(panel, BorderLayout.CENTER);
        pack();
        setVisible(true);
        
        b1.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"1");
            }
        }
        );
        
        b2.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"2");
            }
        }
        );
        
        b3.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"3");
            }
        }
        );
        pi.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"3.14");
            }
        }
        );
        
        b4.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"4");
            }
        }
        );
        
        sin.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                String s = "";
                s2 = f.getText();
                double k = Math.sin(Double.parseDouble(s2));
                s = String.valueOf(k);
                f.setText(""+s);
            }
        }  ) ; 
        
        cos.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                String s = "";
                s2 = f.getText();
                double k = Math.cos(Double.parseDouble(s2));
                s = String.valueOf(k);
                f.setText(""+s);
            }
        }) ;
    
        tan.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                String s = "";
                s2 = f.getText();
                double k = Math.tan(Double.parseDouble(s2));
                s = String.valueOf(k);
                f.setText(""+s);
            }
        });

        b5.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"5");
            }
        }
        );
        
        b6.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"6");
            }
        }
        );
        
        b7.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"7");
            }
        }
        );
        
        b8.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"8");
            }
        }
        );
        
        b9.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"9");
            }
        }
        );
        b0.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+"0");
            }
        }
        );
        
        ba.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                add = true;
                subtract = false;
                multiply = false;
                divide = false;
                power = false;
                f.setText("");
            }
        }
        );
        
        bs.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                subtract = true;
                add = false; 
                multiply = false;
                divide = false;
                power = false;
                f.setText("");
            }
        }
        );
        
        bd.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                divide = true;
                add = false;
                subtract = false;
                multiply = false;
                power = false;
                f.setText("");
            }
        }
        );
        
        bm.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                multiply = true;
                add = false;
                subtract = false;
                divide = false;
                power = false;
                f.setText("");
            }
        }
        );
        
        bpow.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                s1 = f.getText();
                multiply = true;
                add = false;
                subtract = false;
                divide = false;
                power = true;
                f.setText("");
            }
        }
        );
        
        bdott.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText(f.getText()+".");
            }
        }
        );
        
        equals.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt) {
                s2 = f.getText();
                if (add){
                    double solution = Double.parseDouble(s1)+Double.parseDouble(s2);
                    f.setText(""+solution);
                }
                else if (subtract) {
                    double k = Double.parseDouble(s1)-Double.parseDouble(s2);
                    f.setText(""+k);
                }
                else if (multiply) {
                    double k = Double.parseDouble(s1)*Double.parseDouble(s2);
                    f.setText(""+k);
                }
                else if (divide){
                    double k = Double.parseDouble(s1)/Double.parseDouble(s2);
                    f.setText(""+k);
                }
                else if (power) {
                    double k = Double.parseDouble(s1);
                    for (int i = 0; i < Integer.parseInt(s2); i++) {
                        k = k * Integer.parseInt(s1);
                    }
                    f.setText(""+k);
                }
            }
        }
        );
        
        clear.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                f.setText("");
            }
        }
        );

    }
}