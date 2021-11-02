import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
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
    private Random rand;
    private int total;
    private int total2;
    private boolean b = true;
    private String s = "";
    private int k = 0;
    

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
      //population(); 
      //findTotal();
      rand = new Random();
      sc = new Scanner(System.in);
      
      System.out.println("Would you like to play ... yes/no ");
      s = sc.nextLine();
      if (s.equals("yes")) { 
          while(b) {
              System.out.println("pick a number 1 = population, 2 = find total, 3 = random county, 4 = numcon, 5 = stop  ");
              s = sc.nextLine();
              k = Integer.parseInt(s);
              if (k>=1 && k <=5) {
                  System.out.println("thx u input the right info");
                  if (k==1) { population();}
                  if (k==2) { System.out.println(findTotal());}
                  if (k==3) { randomPopulation();}
                  if (k==4) { numcon();} //enter one digit 1-9 to display counties witha population that starts with that digit 
                  if (k==5) { b = false;}
              }
          }
      }
      else {
          System.out.println("Huh. Say yes. rn.");
          //exiting out of loop
          b = false;
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
        for (int i = 0; i < population.length; i++) {
            total2+=population[i];
        }
        return total2;
        //for (int i : population) {
        //    total2+=i;
        //}
    }
    
    public void randomPopulation() {
        k = rand.nextInt(254);
        System.out.println("  " + counties[k] + population[k]);
    }
    
    public void numcon() {
        //numCon //num countes for each leading digit 
        String y;
        for (int x : population) {
            y = "" + x;
            String digit = y.substring(0,1);
            int d = Integer.parseInt(digit);
            numCon[d-1] = numCon[d-1] + 1; 
        }
        System.out.println(numCon[0] + " " + numCon[1]);
    }
    
    public void digitCounty() {
        String y;
        for (int x : population) {
            y = "" + x;
            String digit = y.substring(0, 1);
            int d = Integer.parseInt(digit);
            numCon[d-1] = numCon[d-1] + 1;
        }
    }

    
}
