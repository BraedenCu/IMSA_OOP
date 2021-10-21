import java.io.*;
/**
 * Write a description of class writefile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class writefile
{
    // instance variables - replace the example below with your own
    private FileOutputStream out;
    private PrintStream ps;

    /**
     * Constructor for objects of class writefile
     */
    public writefile(String s)
    {
        // initialise instance variables
        try {
            out = new FileOutputStream(s);
            ps = new PrintStream(out);
        }
        catch (Exception e) {
            System.out.println("Error opening the output file");
        }
    }
    
    public void write (String s) {
        try {
            ps.println(s);
        }
        catch (Exception e) {
            System.out.println("Error when writing to the file");
        }
    }
    
    public void close() {
        try {
            ps.close();
        }
        catch (Exception e) {
            System.out.println("Error when closing the file");
        }
    }
}
