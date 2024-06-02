//Java program to input week number(1-7) and print day of week name using switch case.

import java.util.*;

public class WeekdayOrWeekend
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number between 1-7 :");
        int day = scn.nextInt();

        switch(day)
        {
            case 1,2,3,4,5 : System.out.println("Weekday!!");
            break;
            case 6, 7 : System.out.println("Weekend!!");
            break;
            default : System.out.println("Invalid number!!");
            break;
        }
    }
}