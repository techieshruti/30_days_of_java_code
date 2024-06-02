//Code that prints You have a fever or not

import java.util.*;

public class CheckFever
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the body temperature : ");
        double temp = scn.nextDouble();
        
        if(temp > 98)
        {
            System.out.println("You have fever!");
        }
        else
        {
            System.out.println("You do not have fever!");
        }
    }
}