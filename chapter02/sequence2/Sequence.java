
/**
 * Determine how many times a four character sequence appears in a given string
 *
 * @author Braeden Cullen
 * @version 1.0
 */
public class Sequence
{
         /**
         * Constructor for objects of class Sequence
         */
        public Sequence(String dna, String sub)
        {
            int cnt = 0; //counts number of occourences of substring in dna strand
            int loc = dna.indexOf(sub); //location of sub in dna
            if (loc == -1) {
                System.out.println("String: " + sub + " not found in dna strand");
            }
            else {
                cnt = cnt + 1; //increment counter by one b/c we found a sub in dna
                dna = dna.substring(loc + 4); //substring from end of the sub we discovered to the end of the dna strand");
                while (dna.length() >= 4 && loc != -1) {
                    if (dna.substring(0, 4).equals(sub)) {
                        cnt = cnt + 1;
                        dna = dna.substring(4); //get remainder of string by removing the first four just analyzed in the previous step
                    }
                    else {
                        loc = -1;
                    }
                }
                System.out.println("Sequence: " + sub + " appears " + cnt + " times in the dna strand");
                }
        }
}
    

