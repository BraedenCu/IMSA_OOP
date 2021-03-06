
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
 *This program processes the population of the counties in the state of Texas.
 * 
 * @author (Braeden Cullen) 
 * @version (10/28/2021)
 */
public class Population1
{
    // instance variables - replace the examplpercen;e below with your own
    private Scanner sc;
    private Scanner scan;
    private String[] counties;//stores the name of the counties
    private int[] population;//stroes the population for each county
    private int[] numCon;//number of counties for each leading digit
    private double[] percen;//percent of population for each leading digit
    private double[] digitPop;//stores population for each leading digit
    private double[] percentDigit; //stores pecent of each leading digit
    private Random rand;
    private int total;
    private int total2;
    private boolean b = true;
    private String s = "";
    private int k = 0;
    private Canvas canvas;
    

    /**
     * Constructor for objects of class Population
     */
    public Population1()throws FileNotFoundException
    {
     
      //Initialize the arrays
      counties = new String[254];
      population = new int[254];
      numCon = new int[9];
      percen = new double[9];
      digitPop = new double[9];
      percentDigit = new double[9];
        
      int x = 1000;
      int y = 600;
      int centerX = x/2;
      int centerY = y/2;
      
      rand = new Random();
      sc = new Scanner(System.in);
      
      System.out.println("Would you like to play ... yes/no ");
      s = sc.nextLine();
      if (s.equals("yes")) { 
          //populate arrays
          populate();
          while(b) {
              System.out.println("pick a number 1 = population, 2 = find total, 3 = random county,");
              System.out.println("4 = counties with selected leading digit, 5 = display percentages of each leading digit,");
              System.out.println("6 = graph of the number of counties for each leading digit, 7 = stop  ");
              s = sc.nextLine();
              k = Integer.parseInt(s);
              if (k>=1 && k <=7) {
                  if (k==1) { population();}
                  else if (k==2) { System.out.println(findTotal());}
                  else if (k==3) { randomPopulation();}
                  else if (k==4) { 
                      //enter one digit 1-9 to display counties witha population that starts with that digit 
                      System.out.println("Enter the value of a leading digit you would like to display the counties of");
                      s = sc.nextLine();
                      k = Integer.parseInt(s);
                      digitCounty(k);
                  }
                  else if (k==5) { percentDigitCounty(); }
                  else if (k==6) { drawBarGraph();}
                  else if (k==7) { b = false; break;}
                  else {
                      System.out.println("Please enter a valid number 1-5");
                  }
              }
              else {
                      System.out.println("Please enter a valid number 1-5");
              }
          }
      }
      else if (s.equals("no")) {
          b = false;
      }
      else {
          System.out.println("Please enter yes or no");
      }
    }
    
    //this method reads the file and populates the arrays
    public void populate() throws FileNotFoundException {
        File text = new File("TexasCountyPopulation.txt");
        scan = new Scanner(text);
        String line = "";
        String[] s = new String[2];
        int i = 0;
        //int total = 0;
        while (scan.hasNextLine())
        {
            line = scan.nextLine();
            s = line.split("\t");
            counties[i] = s[0];
            population[i] = Integer.parseInt(s[1]);
            total+=Integer.parseInt(s[1]);    
            i++;          
        }
    }
    
    //this method reads the file and populates the arrays
    public void population()throws FileNotFoundException
    {
        File text = new File("TexasCountyPopulation.txt");
        scan = new Scanner(text);
        String line = "";
        String[] s = new String[2];
        int i = 0;
        total = 0;
        while (scan.hasNextLine())
        {
            line = scan.nextLine();
            System.out.println(line);
            s = line.split("\t");
            counties[i] = s[0];
            population[i] = Integer.parseInt(s[1]);
            total+=Integer.parseInt(s[1]);    
            i++;          
        }
    }
    
    public int findTotal() {
        total2 = 0;
        for (int i = 0; i < population.length; i++) {
            total2+=population[i];
        }
        return total2;
    }
    
    public void randomPopulation() {
        k = rand.nextInt(254);
        System.out.println("  " + counties[k] + population[k]);
    }
    
    public void numcon() {
        //numCon //num countes for each leading digit 
        String y;
        int z = 0;
        for (int x : population) {
            y = "" + x;
            String digit = y.substring(0,1);
            int d = Integer.parseInt(digit);
            //System.out.println(d);
            numCon[d-1] = numCon[d-1] + 1; 
        }
        //System.out.println(z);
        //System.out.println(numCon[0] + " " + numCon[1]);
    }
    
    public void digitCounty(int dig) {
        String y;
        for (int x = 0; x<population.length; x++) {
            y = "" + population[x];
            String digit = y.substring(0, 1);
            int d = Integer.parseInt(digit);
            //numCon[d-1] = numCon[d-1] + 1;
            if (d==dig) {
                System.out.println(counties[x] + " has a population of " + population[x]);
            }
        }
    }
    
    public void percentDigitCounty() { //due monday
        //format: digit - number of counties - percent unrounded - percent rounded to tenths - percent * 10000
        String y;
        System.out.println("*********************************************************************");
        System.out.println("digit" +  "   " + "number" + "   " + "percentage");
        numcon();
        findTotal(); //total2 = total populatoin
        for (int i = 0; i<9; i++) {
            float total = 0;
            for (int x = 0; x<population.length; x++) {
                y = "" + population[x];
                String digit = y.substring(0, 1);
                int d = Integer.parseInt(digit);
                if (d==(i+1)) {
                    total+=population[x];
                }
            }
            percentDigit[i] = total/total2; //need to fix
            System.out.println("" + (i+1) +  "       " + numCon[i] + "        " + Math.round(percentDigit[i] * 10000.0) / 100.0 + "         " + percentDigit[i]*100);
        }
        System.out.println("*********************************************************************");
    }
    
    public void drawBarGraph() { //bar graph due tuesday
        System.out.println("draw a bar graph");
        percentDigitCounty();
        canvas = new Canvas("graph", 1000, 1000);
        canvas.fillRectangle(49*2, 49*2, 302*2, 302*2);
        canvas.eraseRectangle(50*2, 50*2, 300*2, 300*2);
        for (int i =0; i<9; i++) {
            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randomColor = new Color(r, g, b);
            canvas.setForegroundColor(randomColor);
            canvas.fillRectangle(106+62*i, 700-numCon[i]*6, 40, numCon[i]*6);
        }
        Color black = new Color(0, 0, 0);
        for (int i = 1; i<10; i++) {
            canvas.setForegroundColor(black);
            canvas.drawString(String.valueOf(i), 60+62*i, 720);
        }
        for (int i = 0; i<11; i++) {
            canvas.setForegroundColor(black);
            canvas.drawString(String.valueOf(i*10), 70, 700-60*i);
        }
        
        canvas.drawString("Number of Counties by Total Population Starting Digit", 200, 80);
        canvas.drawString("Leading Population Digit", 300, 740);
        canvas.drawString("#", 30, 330);
        
        canvas.drawString("o", 30, 370);
        canvas.drawString("f", 30, 390);
        
        canvas.drawString("c", 30, 430);
        canvas.drawString("o", 30, 450);
        canvas.drawString("u", 30, 470);
        canvas.drawString("n", 30, 490);
        canvas.drawString("i", 30, 510);
        canvas.drawString("e", 30, 530);
        canvas.drawString("s", 30, 550);
    }

    
}
