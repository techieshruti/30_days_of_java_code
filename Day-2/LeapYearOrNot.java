//Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.*;

public class LeapYearOrNot
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nEnter any year to check whether it is leap year or not :");
        int year = scn.nextInt();

        if(year%4 == 0)
        {
          System.out.println("Leap year!!");   
        }
        else
        {
          System.out.println("Not Leap year!!");   
        }
    }
}