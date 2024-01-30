/**Class: LaborDay
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 24, 2024
 *
 * This class will display Labor Day's
 * date from 2019 in the European format.
 */

public class LaborDay {
    public static void main(String[] args){
        
        int date = 2;
        int year = 2019;
        String date_Ameri = "2nd";
        String month_Word = " September";
        String day_Word = "Monday";

        System.out.println("American format:\n" + day_Word + "," + month_Word + " " + date_Ameri + ", " + year);
        System.out.println("European format:\n" + day_Word + " " + date + month_Word + " " + year);

    }
}
