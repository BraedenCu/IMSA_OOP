import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class reads a text file
 *
 * @author Braeden Cullen
 * @version 10/8/21
 */
public class ReadFile
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ReadFile
     */
    String[] s;
    
    public ReadFile(String a) throws FileNotFoundException
    {
        File text = new File(a);
        Scanner scan = new Scanner(text);
        String line = "";
        s = new String[4];
        int i = 0;
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            //System.out.println(line);
            if (i < 4) {
                s[i] = line;
            }
            
            i = i + 1;
        }
        
        int total = 0;
        String[] s1 = new String[2];
        for (int j = 0; j<s.length; j++) {
            s1 = s[j].split(" ");
            total = total + Integer.parseInt(s1[1]);
        }
        System.out.println(total);
    }
}
