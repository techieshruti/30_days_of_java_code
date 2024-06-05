// a program to print the multiplication table of a number N,entered by the user.

import java.util.*;

public class table
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scn.nextInt();
        int table;

        for(int i=1; i<=10; i++)
        {
            table=num*i;
            System.out.println(num + " x " + i + " = " + table);
        }
    }
}