// Overloading using datatypes

import java.util.*;
 
public class prime
{
    public static boolean isPrime(int n)
    {
        boolean isPrime=true;
        for(int i=2; i<=n-1; i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = scn.nextInt();
        System.out.println(n + " is prime number ? " + isPrime(n));
    }
}