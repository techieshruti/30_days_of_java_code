//java program to covert binary number to decimal.

import java.util.*;

public class binToDec
{
    //logic to calculate bin to dec
    public static void binToDec(int binNum)
    {
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;
        
        while(binNum > 0)
        {
            int lastDigit = binNum % 10; // calculate last digit
            decNum = decNum + (lastDigit * (int)(Math.pow(2, pow)));
            pow++;
            binNum = binNum / 10; //delete last digit
        }
        System.out.print("Decimal number of " + myNum + " is : " + decNum);
    }
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any binary number : ");
        int binNum = scn.nextInt();
        binToDec(binNum);

    }
}