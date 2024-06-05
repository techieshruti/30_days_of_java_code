//Java Program to Calculate Compund Interest

import java.util.*;

public class compundInterest
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("\nEnter the principle amount : ");
        float p = scn.nextFloat();
        System.out.print("\nEnter the rate of interest : ");
        float r = scn.nextFloat();
        System.out.print("\nEnter the number of times interest is compunded per year : ");
        float n = scn.nextFloat();
        System.out.print("\nEnter the time limit(years) : ");
        float t = scn.nextFloat();
        double CI = 0;

        CI = p * (Math.pow(1 + (r / n), t));
        System.out.print("\nSimple Interest of given details is : "+ CI);
    }
}