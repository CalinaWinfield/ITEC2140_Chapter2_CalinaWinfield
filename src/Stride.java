/**Class: Stride
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 24, 2024
 *
 * This class will calculate how many
 * mile, feet, and inches a person walks a day
 */

public class Stride {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        final int FEET_PER_MILE = 5280;
        final int INCHES_PER_FEET = 12;
        final int INCHES_PER_MILE = FEET_PER_MILE * INCHES_PER_FEET;

        System.out.print("Enter your height in inches: ");
        int inchHeight = input.nextInt();
        double strideLength = (inchHeight * 0.414);
        System.out.print("Enter how many steps you have walked: ");
        int steps = input.nextInt();
        double inchDist = strideLength * steps;
        double feetDist = inchDist / INCHES_PER_FEET;
        double mileDist = inchDist / INCHES_PER_MILE;

        //formatting here was seen by looking it up (screenshot shown in recording)
        System.out.println("With a stride length of " + String.format("%.3f",strideLength) + " inches, your " + steps + " steps equate to walking:");
        System.out.println(String.format("%.3f",inchDist) + " inch(es) -OR- " + String.format("%.3f",feetDist) + " feet -OR- " + String.format("%.3f",mileDist) + " mile(s)\n");
        //the reason I formatted all the distances was that when I tested the program with the user
        //only taking 1 step, the decimals were very long decimals that repeated the same number.

        //For these next three integers, I somewhat copied what I did in TimeConversion.java
        int inch = (int)inchDist % INCHES_PER_FEET;
        int miles = (int)inchDist / INCHES_PER_MILE;
        int feet = (int)(inchDist - (INCHES_PER_MILE * miles) - inch) / INCHES_PER_FEET;
        System.out.println("Or, in total, " + miles + " mile(s), " + feet + " feet, and " + inch + " inch(es).");

        //These numbers are based off of a link I looked up b/c when I was doing this one, I realized
        //that there are (obviously) different walking speeds, leading to different steps per minute.
        int stepPerMinS = 60;
        int stepPerMinM = 80;
        int stepPerMinF = 100;
        int totalMinS = steps / stepPerMinS;
        int totalMinM = steps / stepPerMinM;
        int totalMinF = steps / stepPerMinF;
        System.out.println("You walked for about " + totalMinS + " minutes, if your average speed was slow (2 mph).");
        System.out.println("You walked for about " + totalMinM + " minutes, if your average speed was moderate (3 mph).");
        System.out.println("You walked for about " + totalMinF + " minutes, if your average speed was fast (5 mph).");

    }
}
