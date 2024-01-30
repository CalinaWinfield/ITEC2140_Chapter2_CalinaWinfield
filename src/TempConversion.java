/**Class: TempConversion
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 24, 2024
 *
 * This class converts a temperature from Celsius to Fahrenheit.
 */

public class TempConversion {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter celsius temperature: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5.0 * celsius) + 32;
        //formatting here was seen in lecture for Jan 23rd (at the 1:09:00 mark)
        System.out.printf("This celsius temperature will convert, in fahrenheit, to %.1f",fahrenheit);

    }
}
