//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.*;

public class practice1
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,1,2,3,4,5};
        System.out.println("\n Given array is :");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        
        System.out.println("Is any value in array appear twice?  " + isValueAppearTwice(arr));

    }

    public static boolean isValueAppearTwice(int arr[])
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}