import java.util.Scanner;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String [] args) {
        writefile write = new writefile(args[0]);
        Scanner scan = new Scanner(System.in);
        String s = new String("");
        for (int i = 0; i<3; i++) {
            System.out.println("Input a string ==> ");
            s = scan.nextLine();
            write.write(s);
        }
        write.close();
    }
}
