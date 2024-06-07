// Overloading using datatypes

// Calculate factorial using functions

import java.util.*;
 
public class overloading2
{

    //function to calculate sun of 2 integer num
    public static int sum(int a, int b)
    {
        return a + b;
    }
    //function to calculate sun of 2 float num
    public static float sum(float a, float b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        System.out.println("Sum of 2 numbers is : " + sum(5, 10));
        System.out.println("Sum of 3 numbers is : " + sum(3.5f, 3.5f));
    }
}