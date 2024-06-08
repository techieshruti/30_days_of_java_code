// Write a Java program to check if a number is a palindrome 
import java.util.*;

public class palindrome
{
    public static boolean isPalindrome(int num)
    {
        int myNum = num;
        int reverse = 0;
        while(num != 0)
        {
            int lastDigit = num % 10; //calculate last digit
            reverse = reverse * 10 + lastDigit;
            num = num / 10;  // delete last digit
        } 
        if(reverse == myNum) 
        {
            return true;
        }        
        return false;
    }
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scn.nextInt();
        isPalindrome(num);
        if(isPalindrome(num))
        {
            System.out.println(num + " is palindrome!");
        }
        else
        {
            System.out.println(num + " is not palindrome!");
        }
    }
}