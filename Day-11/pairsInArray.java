//Java program to print pairs in Array

import java.util.*;

public class pairsInArray
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
        System.out.println("\n Pairs in array are :");
        pairsInArray(arr);
        System.out.println();
    }

    public static void pairsInArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
               System.out.print("(" + arr[i] + ","+ arr[j]+") "); 
            }
        }
    }
    
}