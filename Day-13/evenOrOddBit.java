//Java program to check number is even or odd using bit manipulation.

import java.util.*;

public class evenOrOddBit
{
    public static void main(String[] args)
    {
        evenOrOdd(4);
    }

    public static void evenOrOdd(int n)
    {
        int bitMask = 1;
        if((n & bitMask) == 0)
        {
            System.out.println("Even Number");
        }
        else 
        {
            System.out.println("Odd Number");
        }
    }
}