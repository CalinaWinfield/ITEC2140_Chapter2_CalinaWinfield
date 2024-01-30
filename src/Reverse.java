/**Class: Reverse
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 24, 2024
 *
 * This class will print the digits
 * input by the user in reverse order.
 */

public class Reverse {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        //Because the homework said that 1000 can't be included, I changed "enter a
        //number between 0 and 1000" to just be 0 to 999 (including those two numbers)
        System.out.print("Enter a number between (or equal to) 0 and 999: ");
        int number = input.nextInt();
        //To do this, I just went back to Jan. 25th's lecture (1:42:00 mark)
        //and paid close attention to how you said to do it.
        int ones = number % 10;       //6
        int newNum1 = number / 10;    //24
        int tens = newNum1 % 10;      //4
        int hundreds = newNum1 / 10;  //2

        System.out.print(ones);
        System.out.print(tens);
        System.out.print(hundreds);

    }
}
