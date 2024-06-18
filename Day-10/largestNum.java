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
        public static int smallestNum(int arr[])
        {
            int min = Integer.MAX_VALUE;// it signifies to + infinity
        for(int i = 0; i<arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
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
        int res1 = smallestNum(arr);
        System.out.println("\n\nLargest number is : "+res);
        System.out.println("\nSmallest number is : "+res1);
    }
}