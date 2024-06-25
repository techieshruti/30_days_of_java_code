//java program to calculate length of string

import java.util.*;

public class stringLength
{
    public static void printLetter(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            System.out.println(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String str = scn.nextLine();
        System.out.println("Length of your name is : "+ str.length());
        printLetter(str);
    }
}