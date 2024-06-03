//Print sum of n natural numbers
import java.util.*;

public class SumOfNaturalNum
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number to calculate sum : ");
        int num = scn.nextInt();
        System.out.println("Sum is : ");
        while(count<=num)
        {
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }
}