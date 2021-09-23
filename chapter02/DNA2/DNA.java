
/**
 * Write a description of class DNA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DNA
{
    // instance variables - replace the example below with your own
    private String seq1 = "AGACGGGTTACCATGACTATCTATCTATCTATCTATCTATCTATCTATCACGTACGTACGTATCGAGATAGATAGATAGATAGATCCTCGACTTCGATCGCAATGAATGCCAATAGACAAAA";
    private String seq2 = "AACCCTGCGCGCGCGCGATCTATCTATCTATCTATCCAGCATTAGCTAGCATCAAGATAGATAGATGAATTTCGAAATGAATGAATGAATGAATGAATGAATG";
    private String seq3 = "CCAGATAGATAGATAGATAGATAGATGTCACAGGGATGCTGAGGGCTGCTTCGTACGTACTCCTGATTTCGGGGATCGCTGACACTAATGCGTGCGAGCGGATCGATCTCTATCTATCTATCTATCTATCCTATAGCATAGACATCCAGATAGATAGATC"; 
    private String seq4 = "GGTACAGATGCAAAGATAGATAGATGTCGTCGAGCAATCGTTTCGATAATGAATGAATGAATGAATGAATGAATGACACACGTCGATGCTAGCGGCGGATCGTATATCTATCTATCTATCTATCAACCCCTAG";

    /**
     * Constructor for objects of class DNA
     */
    //public DNA(String name, String s1, int n1, String s2, int n2, String s3, int n3)
    public DNA(String s1, int n1) {
        // add the number of each occourence in the string to the n1 class
        for (int i = 0; i < seq1.length(); i+=4) {
            if (i+4 > seq1.length()) {
                break;
            }
            else {
                if (seq1.substring(i, i+4) == s1) {
                    System.out.println(seq1.substring(i, i+4));
                    n1+=1;
                }
            }
        }
        System.out.println(n1);
        
    }
}
