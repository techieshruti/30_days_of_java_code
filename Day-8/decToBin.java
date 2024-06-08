//java program to covert binary number to decimal.

import java.util.*;

public class decToBin
{
    //logic to calculate bin to dec
    public static void decToBin(int num)
    {
        int myNum=num;
        int pow = 0;
        int binNum = 0;

        while(num > 0)
        {
            int rem = num % 2;
            binNum = binNum + (rem *(int)Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        System.out.print("Binary number of " + myNum + " is : " + binNum);
    }
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any decimal number : ");
        int decNum = scn.nextInt();
        decToBin(decNum);

    }
}