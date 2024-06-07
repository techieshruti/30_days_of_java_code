// Overloading using datatypes

import java.util.*;
 
public class primeInRange
{
    public static boolean isPrime(int n)
    {
        boolean isPrime=true;
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void primeInRange(int n)
    {
        for(int i=2; i<=n; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range you want to check prime number : ");
        int n = scn.nextInt();
         primeInRange(n);
    }
}