/**Class: Paint
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 24, 2024
 *
 * This class will calculate the gallons and
 * quarts of paint that are needed to paint a room.
 */

public class Paint {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);

        int paintCoverage = 350;
        System.out.print("Enter the length of the room (in ft): ");
        int L = input.nextInt();
        System.out.print("Enter the width of the room (in ft): ");
        int W = input.nextInt();
        System.out.print("Enter the height of the room (in ft): ");
        int h = input.nextInt();
        System.out.print("Enter the number of windows: ");
        int windows = input.nextInt() * 15;
        System.out.print("Enter the number of doors: ");
        int doors = input.nextInt() * 21;
        int floor = (L * W);

        int surfaceAreaCeil = (2 * ((L * W) + (L * h) + (h * W))) - (doors + windows + floor);
        System.out.println("Including the ceiling, the surface area will be " + surfaceAreaCeil + " sqft.");
        double quarts = ((double)surfaceAreaCeil / paintCoverage) / 0.25;
        System.out.println("For this size room, you will need " + quarts + " quarts.");
        int gallons = surfaceAreaCeil / paintCoverage;
        System.out.println("For this size room, you will need " + gallons + " gallons.");

    }
}
