//a program to find the factorial of any number entered by the user
import java.util.*;

public class factorial
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any positive number :");
        int num = scn.nextInt();
        int fact = 1;

        for(int i=1; i<=num; i++)
        {
            fact*=i;
        }
    System.out.println("Factorial: "+fact);
    }
}