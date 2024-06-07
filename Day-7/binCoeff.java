// Calculate factorial using functions

import java.util.*;

public class binCoeff
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

    public static int binCoeff(int n, int r)
    {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binCoeff = n_fact / (r_fact * nmr_fact);
        return binCoeff;
    }
    public static void main(String[] args)
    {
        System.out.print(binCoeff(5,4));
        }
}