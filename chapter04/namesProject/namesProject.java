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
 * Write a description of class namesProject here.
 *
 * @author (Braeden Cullen)
 * @version (96)
 */
public class namesProject extends JFrame
{
    private Scanner scan;
    private Scanner sc;

    //for calculator
    String s1 = "";
    String s2 = ""; 
    ArrayList<NameRecord> names = new ArrayList<NameRecord>();
    ArrayList<String> rawLines = new ArrayList<String>();
    HashMap<String, Integer> namesHash = new HashMap<String, Integer>();
    
    public namesProject() throws FileNotFoundException
    {
        String fullString = readFile("names.txt");
        String[] arr = fullString.split(" ");
        int x = 0;

        for (int i = 0; i<arr.length; i++){
            
            try {
                int z = Integer.parseInt(arr[i]);
                names.get(x).rankings.add(z);                
            }
            catch(Exception e) {
                NameRecord toAdd = new NameRecord(arr[i]);
                names.add(toAdd);
                x+=1;
            }
        }
        
        //fill hashmap
        for (String line : rawLines) {
            String[] words = line.split(" ");
            namesHash
        }
    }
    public String readFile(String fileName) throws FileNotFoundException {
        //returns string containing entire text from a file
        File text = new File(fileName);
        scan = new Scanner(text);
        String line = "";
        String fullString = "";
    
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            fullString+=line;
            rawLines.add(line);
        }
        return fullString;
    }
    
    
    
    
    
    
    
    
    
    public void Calculator() {
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
        pack();
        setVisible(true);
        b1.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    f.setText(f.getText()+"1");
                }
            }
        );
        
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
