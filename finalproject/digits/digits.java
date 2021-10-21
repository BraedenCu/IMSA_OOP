
/**
 * Write a description of class digits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class digits
{
    // instance variables - replace the example below with your own
    private int[] num;
    /**
     * Constructor for objects of class digits
     */
    public digits()
    {
        num = new int[10];
        int total = 0;
        for(int i = 0; i < 10; i++) {
            num[i] = (int)(Math.random()*100+1); 
            System.out.println(num[i]);
        }
        add();
        multiply();
        max();
        percent();
        trials(100);
    }
    
    public void add() {
        int total = 0;
        for (int i=0; i<num.length; i+=1) {
            total+=num[i];
        }
        System.out.println("Total Added Value: " + total);
    }
    
    public void multiply() {
        int total = 1;
        for(int i = 0; i<num.length; i+=1) {
            total*=num[i];
        }
        System.out.println("Total Multiplied Value: " + total);
    }
    
    public void max() {
        int max = num[0];
        for(int i = 1; i<num.length; i+=1) {
            if (num[i] > max){
                max = num[i];
            }
        }
        System.out.println("Maxmum value: " + max);
    }
    public void percent() {
        //returns the percent of numbers less than or equal to 50 in the array
        int lessThan = 50;
        int numLessThan = 0;
        for (int i = 0; i<num.length; i+=1) {
            if (num[i] <= 50) {
                numLessThan+=1;
            }
        }
        System.out.println("Percent of array less than 50: " + (int)(100*(1.00*numLessThan/num.length)));
    }
    public int trials(int k) {
        //this method conducts the number of trials given by the parameter ten displays percent of numbers
        //less than or equal to 50
        int total = 0;
        
        for (int i = 0; i < k; i++) {
            int numLessThan = 0;
            int[] n = new int[10];
            for(int a = 0; a < n.length; a++) {
                n[a] = (int)(Math.random()*100+1); 
                if (n[a] <= 50) {
                    numLessThan+=1;
                }
            }            
            total += (int)(100*(1.00*numLessThan/num.length));
        }    
        
        System.out.println(total/k);
        return total/k;     
    }
    public void sort(int[] s1) {
        //bubble sort :)
        int temp = 0;
        for (int i = 0; i<s1.length-1; i++) {
            for (int j = 0; j < s1.length-1-i; j++) {
                int temp = s1[j];
                s1[j] = s1[j+1];
                s1[j+1] = temp;
            }
        }
        if (s1.equals("up")) {
            
        }
        else if (s1.equals("down")) {
            
        }
        else {
            System.out.println("neither up nor down");
        }
        for(int i = 0; i < 100; i++) {
            //System.out.println(]);
        }
    }
    
    
}
