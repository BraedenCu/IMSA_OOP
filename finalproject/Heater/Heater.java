
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private int temp;

    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        // initialise instance variables
        this.temp = 50;
    }
    
    public void changeTempGauge(int desiredTemp) {
        //change temp gauge
    }
    public void showHeater() {
        //draw heater (gauge, colored square, background shapes)
        //increment decrement is by 10
    }
    
    public void makeWarmer() {
        temp = temp + 10;
        if (temp >= 100) {
            temp = 100;
            System.out.println("maximum temperature exceeded, temperature set to 100");
            changeTempGauge(temp);
        }
        else {
            changeTempGauge(temp);
        }
    }
    
    public void makeCooler() {
        temp = temp - 10;
        if (temp <= 0) {
            temp = 0;
            System.out.println("maximum temperature exceeded, temperature set to 0");
            changeTempGauge(temp);
        }
        else {
            changeTempGauge(temp);
        }
    }
}
