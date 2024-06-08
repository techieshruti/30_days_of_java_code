// Write a method named isEven that accepts an int argument.The method should return true if the argument iseven,or false otherwise.Also write a program to test your method

import java.util.*;

public class evenOrOdd
{
    public static boolean isEven(int num)
    {
        boolean isEven = true;
        if(num % 2 != 0)
        {
           isEven = false;
           System.out.println("Number is : Odd");
        }
        else 
        {
            System.out.println("Number is : Even");
        }
        return isEven;
    }
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scn.nextInt();
        isEven(num);
    }
}