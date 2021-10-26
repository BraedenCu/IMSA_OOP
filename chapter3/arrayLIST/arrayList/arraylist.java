import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class arraylist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arraylist
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String s = "";
        for (int i = 0; i<5; i++) {
            System.out.println("Enter string --> ");
            s = scan.nextLine();
            list.add(s);
        }
        /*
        for (int i = 0; i<5; i++) {
            System.out.println(list.get(i));
        }
        */
        for (String p : list) {
            System.out.println(p);
        }
        //this is a usage of hte iterator
        Iterator<String> it = list.iterator();
        //loop as long as iterator has next item
        while(it.hasNext()) {
            s = it.next();
            
            
        }
    }
}
