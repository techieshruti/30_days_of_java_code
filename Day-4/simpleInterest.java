//Java Program to Calculate Simple Interest

import java.util.*;

public class simpleInterest
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("\nEnter the principle amount : ");
        float p = scn.nextFloat();
        System.out.print("\nEnter the rate of interest : ");
        float r = scn.nextFloat();
        System.out.print("\nEnter the time limit : ");
        float t = scn.nextFloat();
        double SI = 0;

        SI = (p * r * t) / 100;
        System.out.print("\nSimple Interest of given details is : "+ SI);
    }
}