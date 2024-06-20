//Java program to print subarrays

import java.util.*;

public class maxSubArraySum
{
    public static void main(String[] args)
    {
        int arr[] = {2,4,6,8,10};
        System.out.println("\n Given Array is :");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        maxSubArraySum(arr);
        }

    public static void maxSubArraySum(int arr[])
    {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++)
       {
         int start=i;
         for(int j=i; j<arr.length; j++)
         {
            int end = j;
            currSum =0;
            for(int k=start; k<=end; k++)
            {
                //subarray sum
                currSum += arr[k];
            }
            System.out.println(currSum);
            if(maxSum < currSum)
            {
                maxSum = currSum;
            }
  
         }
                 
       }
       System.out.println("Max Sum = " +maxSum);
       }
   
 
}