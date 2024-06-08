// Java method to compute the sum of the digits in an integer 
import java.util.*;
public class sumOfDigits
{
    public static int sumOfDigits(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any integer number : ");
        int number = scn.nextInt();
        System.out.println("The sum of "+ number +"'s digits is "+sumOfDigits(number));
        
    }
}