//Java program to print subarrays

import java.util.*;

public class subArray
{
    public static void main(String[] args)
    {
        int arr[] = {2,4,6,8,10,12,14};
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
        for(int i=0; i<arr.length; i++)
        {
            int start=i;
            for(int j=0; j<arr.length; j++)
            {
                int end=j;
                for(int k=start; k<=end; k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}