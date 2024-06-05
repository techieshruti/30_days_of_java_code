//Java Program to Multiply Two Floating-Point Numbers

import java.util.*;

public class multiply
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("\nEnter first number : ");
        float num1 = scn.nextFloat();
        System.out.print("\nEnter second number : ");
        float num2 = scn.nextFloat();

        float prod = num1 * num2;

        System.out.print("\nProduct of two floating point number is : "+ prod);
    }
}