//a program that reads a set of integers,and the n prints the sum of the even and odd integers

import java.util.*;

public class sum
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        

        do
        {
            System.out.println("Enter any number : ");
            int number = scn.nextInt();
            if(number%2 == 0)
            {
                evenSum+=number;
            }
            else
            {
               oddSum+=number; 
            }
            System.out.println("Do you want to continue: if yes press 1 otherwise press 0.");
            choice = scn.nextInt();
        }
        while(choice==1);
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
    }
}