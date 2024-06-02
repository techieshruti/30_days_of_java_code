//WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negativee

import java.util.*;

public class PositiveOrNegative
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number : ");
        float num = scn.nextFloat();

        if(num>0)
        {
         System.out.println("Entered number is Positive.");   
        }
        else
        {
            System.out.println("Entered number is Negative.");
        }
    }
}