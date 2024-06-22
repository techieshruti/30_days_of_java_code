//Swap two numbers without using any third variable

import java.util.*;

public class swapping
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nEnter value of a : ");
        int a = scn.nextInt();
        System.out.println("Enter value of b : ");
        int b = scn.nextInt();
        swap(a,b);
    }

    public static void swap(int a, int b)
    {
        System.out.println("Before swapping a is : "+a+ " and b is : "+b); 

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping a is : "+a+ " and b is : "+b);
    }
}
