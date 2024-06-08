// Write a Java method to compute the averageof three numbers.

import java.util.*;

public class averageOf3
{
    public static int averageOf3(int a, int b, int c)
    {
        int avg = (a + b + c) / 3;
        return avg;
    }
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = scn.nextInt();
        System.out.print("Enter second number : ");
        int b = scn.nextInt();
        System.out.print("Enter third number : ");
        int c = scn.nextInt();
        System.out.print("Average three numbers is : " + averageOf3(a,b,c));

    }
}