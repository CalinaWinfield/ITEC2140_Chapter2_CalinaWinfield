/**Class: Time
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 24, 2024
 *
 * This class will exercise the use of the
 * arithmetic operators, and stimulate thought
 * of compound entities (like time of day)
 * that are represented with multiple values.
 */

public class Time {
    public static void main(String[] args){

        int secInDay = 86400;
        int secInMin = 60;
        int secInHour = 3600;

        int second = 30;
        int minute = 15;
        int hour = 17;
        System.out.println("In 24-hour format, 30 seconds after 5:15pm is " + hour + ":" + minute + ":" + second);
        int thisDaySec = ((hour * secInHour) + (minute * secInMin) + second);
        System.out.println("For this time, there are " + (secInDay - thisDaySec) + " seconds left in the day.");
        double percentDayLeft = (thisDaySec * 100.0) / secInDay;
        //formatting here was seen by looking it up (screenshot shown in recording)
        System.out.println(String.format("%.2f",percentDayLeft) + "% of the day has passed.");

    }
}
