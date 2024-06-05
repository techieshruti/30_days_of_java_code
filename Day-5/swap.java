// Java Program to Swap Two Numbers

import java.util.*;

public class swap
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("\n Enter first number : ");
        int a = scn.nextInt();
        System.out.print("a = " + a);
        System.out.print("\n Enter second number : ");
        int b = scn.nextInt();
        System.out.print("b = " + b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.print("\n After Swapping :");
        System.out.print("\n a = " + a);
        System.out.print("\n b = " + b);
    }
}