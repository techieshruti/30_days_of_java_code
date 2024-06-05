// Java Program to Find Largest Among 3 Numbers

import java.util.*;

public class largestOfNum
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any three Numbers to check which one is largest : ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        if(num1 > num2 && num1 > num3)
        {
            System.out.println(num1 + " is greater."); 
        }
        else if(num2 > num3)
        {
            System.out.println(num2 + " is greater.");
        }
        else 
        {
            System.out.println(num3 + " is greater.");
        }
    }
}