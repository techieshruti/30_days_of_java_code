//Java program to print subarrays

import java.util.*;

public class subArray
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

        subarrays(arr);
        
    }

    public static void subarrays(int arr[])
    {
        int ts =0;
        List<Integer> subArraySums = new ArrayList<>();
       for(int i=0; i<arr.length; i++)
       {
         int start=i;
         for(int j=i; j<arr.length; j++)
         {
            int end = j;
            int sum = 0;
            for(int k=start; k<=end; k++)
            {
                System.out.print(" "+ arr[k]);
                sum= sum+arr[k];
            }
            subArraySums.add(sum);
            ts++;
            System.out.println();
         }
         System.out.println();
         
       }
       System.out.println("total subarrays are :" +ts);
       System.out.println("sum of subarrays are :" +subArraySums);

       //calculate maximum value
       public static int largest(int subArraySums[])
       {
          int large = Integer.MIN_VALUE; //signifies -infinity
          if(large < subArraySums[i])
          {
            large = subArraySums[i];
          }
          return large;
       }

       //calculate minimum value
       public static int smallestNum(int subArraySums[])
        {
            int min = Integer.MAX_VALUE;// it signifies to + infinity
        for(int i = 0; i<arr.length; i++)
        {
            if(min > subArraySums[i])
            {
                min = subArraySums[i];
            }
        }
        return min;
        }

       System.out.println("Minimum sum of subarrays is :" + largest(subArraySums));
       System.out.println("Maximum sum of subarrays is :" + smallestNum(subArraySums));
    }
}