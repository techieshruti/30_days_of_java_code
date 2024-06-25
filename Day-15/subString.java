//java program to print substrings

import java.util.*;

public class substring
{
    public static String substrings(String str, int si, int ei)
    {
        String substr = " ";
        for(int i = si; i<ei; i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args)
    {
        String str = "Welcome to java tutorial!";
        System.out.print(substrings(str, 0 ,7));
    }
}