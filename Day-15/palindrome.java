//java program to check string is palindrome or not

import java.util.*;

public class palindrome
{
    public static boolean isPalindrome(String str)
    {
        for(int i=0; i<str.length()/2; i++) 
        {
            int low = 0;
            int high = str.length()-1;
            if(str.charAt(low) != str.charAt(high))
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
        System.out.println(str + " Is palindrome ? "+ isPalindrome(str));
    }
}