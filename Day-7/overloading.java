// Overloading using parameters

// Calculate factorial using functions

import java.util.*;
 
public class overloading
{

    //function to calculate sun of 2 num
    public static int sum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    //function to calculate sun of 3 num
    public static int sum(int a, int b, int c)
    {
        int sum = a+b+c;
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = scn.nextInt();
        System.out.print("Enter value of b : ");
        int b = scn.nextInt();
        System.out.print("Enter value of c : ");
        int c = scn.nextInt();

        System.out.println("Sum of 2 numbers is : " + sum(a,b));
        System.out.println("Sum of 3 numbers is : " + sum(a,b,c));
    }
}