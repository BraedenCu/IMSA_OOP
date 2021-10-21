import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * Write a description of class Heater here.
 *
 * @author (Braeden Cullen)
 * @version (1.0)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private int temp;
    private int oldTemp;
    private Canvas canvas;
    private int x;
    private int y;
    private int centerX;
    private int centerY;
    private int thermoH;
    private int verticalSize;
    private Color backgroundColor = new Color(193, 201, 196);
    private Color heaterColor = new Color(33, 32, 32);
    private Color lightRed = new Color(235, 120, 129);

    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        // initialise instance variables
        this.temp = 0;
        this.oldTemp = 0;
        x = 1000;
        y = 600;
        centerX = x/2;
        centerY = y/2;
        canvas = new Canvas("Heater", x, y);
        
        //TEMP
        showHeater();
    }
    
    public void drawTicks() {
        canvas.setForegroundColor(lightRed);
        //draw tick marks
        int numTickMarks = 10;
        int steps = verticalSize/numTickMarks;
        for (int i = 0; i < numTickMarks; i++) {
            canvas.drawLine(centerX-50, centerY+100-(steps*i), centerX-25, centerY+100-(steps*i));
        }
        canvas.drawLine(centerX-50, centerY+100, centerX-50, centerY-230);
        canvas.drawLine(centerX+50, centerY+100, centerX+50, centerY-230);
        canvas.drawLine(centerX-50, centerY-230, centerX+50, centerY-230);
    }

    public void showHeater() {
        canvas.setVisible(true);
        //critical functions
        //draw line: canvas.drawLine(int x1, int y1, int x2, int y2)
        //create rectangle: canvas.fill(new Rectangle(xPos, yPos, width, height));
        //create circle: new Circle(x+454, y+85, 500, 335);
        //set background color
        canvas.setBackgroundColor(heaterColor);
        canvas.setForegroundColor(backgroundColor);
        canvas.fillRectangle(0, 0, x, y);
        
        //draw heater backdrop
        canvas.setForegroundColor(heaterColor);
        canvas.fill(new Rectangle(200, 50, 600, 500));
        
        //draw top of bulb lines
        verticalSize = 300;
        int verticalShift = 100;
        
        //draw tick marks
        drawTicks();
        //draw bottom end of temp range
        canvas.setForegroundColor(lightRed);
        canvas.fillRectangle(centerX-50, centerY+100-30-(3*0), 100, 30+(3*0));
        
        //draw the bottom bulb 
        int diameter = 150;
        Ellipse2D.Double bulb = new Ellipse2D.Double(centerX-diameter/2, (centerY-diameter/2+verticalShift)+20, diameter, diameter);
        canvas.fill(bulb);
        canvas.draw(bulb);
        
        //draw up and bown boxes
        canvas.setForegroundColor(backgroundColor);
        canvas.fillRectangle(centerX+125, centerY+30, 100, 100);
        canvas.setForegroundColor(backgroundColor);
        canvas.fillRectangle(centerX+125, centerY-130, 100, 100);
        
        //draw temp box
        canvas.setForegroundColor(backgroundColor);
        canvas.fillRectangle(centerX-225, centerY-50, 100, 100);
        
        //draw temp in box
        canvas.setForegroundColor(heaterColor);
        canvas.drawString("0 degrees", centerX-225+20, centerY);
        
        //draw increment/decrement in box
        canvas.setForegroundColor(heaterColor);
        canvas.drawString("+10", centerX+225-64, centerY-80);
        canvas.drawString("-10", centerX+225-60, centerY+85);
          
    }
    
    public void makeWarmer() {
        oldTemp = temp;
        temp = temp + 10;
        if (temp >= 100) {
            temp = 100;
            System.out.println("maximum temperature exceeded, temperature set to 100");
            changeTempGauge();
        }
        else {
            changeTempGauge();
        }
    }
    
    public void makeCooler() {
        oldTemp = temp;
        temp = temp - 10;
        if (temp <= 0) {
            temp = 0;
            System.out.println("maximum temperature exceeded, temperature set to 0");
            changeTempGauge();
        }
        else {
            changeTempGauge();
        }
    }
    
    public void changeTempGauge() {
        //change height of thermomenter 
        //draw rectangle representing temp height within thermometer
        //System.out.println(temp);
        //System.out.println(centerY);
        canvas.setBackgroundColor(heaterColor);
        canvas.setForegroundColor(lightRed);
        canvas.eraseRectangle(centerX-50, centerY+100-30-(3*oldTemp), 100, 30+(3*(oldTemp)));
        canvas.fillRectangle(centerX-50, centerY+100-30-(3*temp), 100, 30+(3*temp));
        canvas.setBackgroundColor(backgroundColor);
        //draw tick marks that were erased
        drawTicks();
        canvas.setForegroundColor(heaterColor);
        canvas.eraseString(""+oldTemp+" degrees", centerX-225+20, centerY);
        canvas.drawString(""+temp+ " degrees", centerX-225+20, centerY);
        canvas.setBackgroundColor(heaterColor);
    
    }
}
