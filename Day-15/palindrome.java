//java program to check string is palindrome or not

import java.util.*;

public class palindrome
{
    public static boolean isPalindrome(String str)
    {
        for(int i=0; i<str.length()/2; i++) 
        {
            int n = str.length()/2;
            if(str.charAt(i) != str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any string to check if it is palindrome or not : ");
        String str = scn.nextLine();
        System.out.println(isPalindrome(str));
    }
}