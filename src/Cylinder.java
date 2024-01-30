/**Class: Cylinder
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 24, 2024
 *
 * This class calculates the base area and volume of a cylinder.
 */

public class Cylinder {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        double pi = 3.1416;
        System.out.print("Enter the height of the cylinder: ");
        int height = input.nextInt();
        System.out.print("Enter the radius of the cylinder: ");
        int radius = input.nextInt();
        double volume = pi * radius * radius * height;
        double baseArea = pi * radius * radius;
        //I multiplied rather than dividing the volume by the height so that the decimal would be shorter and not repetitive.
        System.out.println("The volume of this cylinder is: " + volume);
        System.out.println("The base area of this cylinder is: " + baseArea);

    }
}
