// Calculate factorial using functions

import java.util.*;

public class factorial
{
    public static int factorial( int num)
    {
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact = fact * i;
            
        }  
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any number you want to calculate factorial : ");
        int num = scn.nextInt();

        int fact = factorial(num);
        System.out.print("factorial is : " + fact);
    }
}