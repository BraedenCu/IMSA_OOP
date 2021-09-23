
/**
 * Write a description of class Calculate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



public class Calculator {
    private int pp;
    private String test;
    public Calculator {
        //constructor
    }
    
    public int add (int a, int b) {
        return a+b;
    }
}
public class Calculate
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Calculate
     */
    public Calculate()
    {

    }
    
    public void calc(double price, int quantity) {
        if (quantity < 100) {
            System.out.println("Revenue is :" + price*quantity);
        }
        if (quantity >= 100 && quantity <= 120) {
            System.out.println("Revenue is :" + 0.9*price*quantity);
        }
        if (quantity > 120) {
            System.out.println("Revenue is:: " + 0.85*price*quantity);
            
        }
    }
    public void loop() {
        for(int i=1; i<10; i++) {
            System.out.println(i);
        }
    }
     
}
