import java.util.ArrayList;
/**
 * Write a description of class NameRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NameRecord
{
    String name;
    ArrayList<Integer> rankings = new ArrayList<Integer>();
    
    
    public NameRecord(String n) {
        name = n;
    }
    
    public void addName(String n) {
        name = n;
    }
    
    public void addRanking(int ranking) {
        rankings.add(ranking);
    }
}
