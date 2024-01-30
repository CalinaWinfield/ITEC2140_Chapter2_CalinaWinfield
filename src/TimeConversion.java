/**Class: TimeConversion
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 24, 2024
 *
 * This class will convert a given total number
 * of seconds into hours, minutes and seconds.
 */

public class TimeConversion {
    public static void main(String[] args){

    java.util.Scanner input = new java.util.Scanner(System.in);
    //break down the number of seconds in an hour and minute
    int secInHour = 3600;
    int secInMin = 60;
    //prompt user to input number of seconds
    System.out.print("Enter a number of seconds: ");
    int totalSec = input.nextInt();
    int seconds = totalSec % secInMin;
    int hours = totalSec / secInHour;
    int minutes = (totalSec - (secInHour * hours) - seconds) / secInMin;
    System.out.println("This amount of seconds equates to " + hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s).");

    }
}
