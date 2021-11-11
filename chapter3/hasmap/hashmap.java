import java.util.*;
import java.util.HashSet;

/**
 * Write a description of class hashmap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hashmap
{
    // instance variables - replace the example below with your own
    private HashMap<String, String>phonebook;
    private HashSet<String>myset;

    /**
     * Constructor for objects of class hashmap
     */
    public hashmap()
    {
        phonebook = new HashMap<String, String>();
        phonebook.put("John", "773-876-9900"); // john is the key then phone number is the value
        phonebook.put("Jill", "847-331-9599");
        phonebook.put("Sham", "231-420-1613");
        
        System.out.println(phonebook.get("Sham"));
        
        myset = new HashSet<String>();
        myset.add("one");
        myset.add("two");
        myset.add("three");
        for (String s : myset) {
            System.out.println(s);
        }
    }
}
