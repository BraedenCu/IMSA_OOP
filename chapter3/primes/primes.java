
/**
 * Write a description of class primes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class primes
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class primes
     */
    public primes()
    {
        int input = 1000000;
        calcprimes(input);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void calcprimes(int top) {
        int total = 0;
        int max = 0;
        for (int i = 0; i<top; i++) {
            boolean output = isprime(i);
            if (output==true) {
                total+=1;
                if (i > max) {
                    max = i;
                    //System.out.println(max);
                }
            }
        }
        System.out.println(total + "        " + max);
    }
    
    public boolean isprime(int num) {
        if (num <= 2) {
            return false;
        }
        //any number cannot be divisible by more than half its value
        for (int i = 2; i<(num/2); i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }  
    
}
