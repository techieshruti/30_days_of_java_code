//display all numbers excepts multiple of 10

import java.util.*;

public class UserInput1
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        do
        {
            System.out.println("Enter your number : ");
            int num = scn.nextInt();

            if(num % 10 == 0)
            {
            
                break;
            }
            System.out.println(num);
        }
        while(true);
    }
}