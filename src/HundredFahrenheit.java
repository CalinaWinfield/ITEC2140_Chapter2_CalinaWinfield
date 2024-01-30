/**Class: HundredFahrenheit
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 24, 2024
 *
 * This class converts 100 degrees Fahrenheit to Celsius.
 */

public class HundredFahrenheit {
    public static void main(String[] args){

        int fahrenheit = 100;
        double celsius = (5.0/9.0) * (fahrenheit - 32);
        //formatting here was seen in lecture for Jan 23rd (at the 1:09:00 mark)
        System.out.printf("In Celsius, 100 degrees fahrenheit is %.1f ",celsius);

    }
}
