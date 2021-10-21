
/**
 * This class does calculations.
 * 
 * @author (Braeden Cullen) 
 * @version (10/15/2021)
 */
public class Array_Lab
{
    // instance variables - replace the example below with your own
   
    int [] num = new int[10];
    /**
     * Constructor for objects of class Calculate
     * MAKE NO CHANGES TO THE CONSTRUCTOR
     */
    public Array_Lab()
    {
       //initailize the array
       for (int i = 0; i < 10; i++)
       {
        num[i] = (int)(Math.random()*5+1);
        if (num[i] == 2 || num[i] == 3)
        {
            num[i] = -num[i];
        }
        System.out.print(num[i]+ " ");
       }
       System.out.println();
       countFive();
       System.out.println("Thesum is --> " + sum());
       changeSign();
       for (int i = 0; i < 10; i++)
       {
        System.out.print(num[i]+ " ");   
       }
       System.out.println();
    }
//this method counts how many times number 5 appears in the array num and
//displays that count on the terminal window.
    public void countFive( )
    {
        int n = 0;
        for (int i : num) {
            if (i==5) {
                n+=1;
            }
        }
        System.out.println("The number five appears --> " + n + " times");
        
    }
//this method counts the sum of the numbers in num and returns that sum
    public int sum()
    {
        int sum = 0;
        for (int n : num) {
            sum+=n;    
        }
        return sum;  
    }
//this method changes the sign of the number and stores it back in the array 
//and displays the new numbers
public void changeSign()
{
    //change the sign of all numbers in the array and store the new value in the array
    for (int i = 0; i < num.length; i++) {
        num[i] = num[i] * -1;
    }
    // displays the new numbers in the updated array
    for (int a = 0; a<num.length; a++) {
        System.out.print(num[a] + " ");
    }
    System.out.println(" ");
}
}

