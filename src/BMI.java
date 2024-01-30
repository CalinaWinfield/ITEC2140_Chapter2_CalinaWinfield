/**Class: BMI
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 24, 2024
 *
 * This class will calculate the BMI of the person.
 */

public class BMI {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your weight (in lbs.): ");
        double pounds = input.nextDouble();
        double POUNDS_PER_KG = 2.2;
        double kilograms = pounds / POUNDS_PER_KG;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        System.out.print("Enter your height (ft. part) [EX: If you're 5' 9'', put the 5]: ");
        int feet = input.nextInt();
        System.out.print("Enter your height (in. part) [EX: If you're 5' 9'', put the 9]: ");
        int inches = input.nextInt();
        int totalInches = (feet * 12) + inches;

        double M_PER_INCH = 0.0254;
        double meters = totalInches * M_PER_INCH;
        System.out.println(totalInches + " inches = " + meters + " meters");

        double BMI = kilograms / (meters * meters);
        //formatting here was seen in lecture for Jan 23rd (at the 1:09:00 mark)
        System.out.printf("Your BMI is %.1f ",BMI);

    }
}
