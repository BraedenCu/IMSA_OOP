import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Write a description of class population here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class population
{
    // instance variables - replace the example below with your own
    private Scanner scan;
    private Scanner sc;
    private String[] counties; //names of counties
    private int[] population; //population for a county
    private int[] numCon; //number of conties based on starting digit
    private double[] percent; //percent of counties based on starting digit
    private double[] digitPop;
    private Random rand;
    
    public population(String s)throws FileNotFoundException {
        File text = new File(s);
        scan = new Scanner(text);
        String line = "";
        String[] sa = new String[2];
        int lineNum = 0;
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            //System.out.println(line);
            //for (int j = 0; j<s.length; j++) {
            sa = line.split(" ");
            System.out.println(sa[0]);
            counties[lineNum] = sa[0];
            population[lineNum] = Integer.parseInt(sa[1]);
            lineNum+=1;
        }
        
    }
}
