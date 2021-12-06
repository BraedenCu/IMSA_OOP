
/**
 * Write a description of class stringExpansion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class stringExpansion
{
    String input;
    String output;
    
    public stringExpansion() throws Exception {
        input = "a23b";
        output = "";
        for (int i = 0; i < input.length(); i++) {
            int val = checkInt(input.substring(i, i+1));
            if (val != 0 && i < input.length()-1) {
                boolean currValInt = true; 
                String curr = "";
                while(currValInt) {
                    i+=1;
                    int newVal = checkInt(input.substring(i, i+1));
                    if (newVal != 0) {
                        val = newVal;
                    }
                    else {
                        currValInt = false;
                        curr = input.substring(i, i+1);
                    }

                }
                for(int z = 0; z < val+1; z++) {
                    output+=(""+curr);       
                }         
            }
            else if (val ==0) {
                output+=input.substring(i, i+1);
            }
    
        }
        System.out.println(input);
        System.out.println(output);
    }
    
    public int checkInt(String x) {
        try {
            int val = Integer.parseInt(x);
            return val;
        }
        catch (Exception e) {
            System.out.println("not int");
            return 0;
        }
    }
}
