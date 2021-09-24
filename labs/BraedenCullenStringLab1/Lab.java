
/**
 * This lab is for Period 2.
 * 
 * @author (Braeden Cullen) 
 * @version (9/24/21)
 */
public class Lab
{
    

    /**
     * Constructor for objects of class Lab
     */
    public Lab()
    {
        
        
    }
    //the method takes two string parameters s1 and s2 both lowercase and replaces all
    //occurances of s2 in s1 such that the replaced s2 would be in all capital
    //letters.  For example "abcefgabc" replace all "abc" with "xyz", the result "XYZefgXYZ",
    //which is returned.
    //test case:
    //"abcxyzabc"
    //"abc"
    //"p"
    //PxyzP
    public String replace(String s1, String s2, String s3)
    {
        String output = "";
        output = s1.replaceAll(s2, s3.toUpperCase());
        return (output);
    }
    //the following method creates a password from two strings s1 and s2.
    //the password takes first three letters of s1 and first three letters
    //of s2 and has an * in between. For example, with "abcd" and "qwer",
    //the created password would be "abc*qwe".
    public String password(String s1, String s2)
    {
        String output = s1.substring(0, 3) + "*" + s2.substring(0, 3);
        return (output);   
    }
    //the following method searches for s2 in s1. If s2 is found then returns "success",
    //otherwise returns "fail".
    public String find(String s1, String s2)
    {
        int index = s1.indexOf(s2);
        if (index >= 0) {
            return ("success");
        }
        else {
            return ("fail");
        }
    }
}
