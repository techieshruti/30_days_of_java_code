//java program to calculate largest number among given array

import java.util.*;

public class largestNum
{
    public static int largestNum(int arr[])
    {
        int large = Integer.MIN_VALUE;// it signifies to - infinity
        for(int i = 0; i<arr.length; i++)
        {
            if(large < arr[i])
            {
                large = arr[i];
            }
        }
        return large;
    }
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int arr[]= {10, 20, 30, 52, 12, 60, 45, 20, 59, 45, 29, 68};
        System.out.println("\nGiven array is : ");
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        int res = largestNum(arr);
        System.out.println("\n\nLargest number is : "+res);
    }
}