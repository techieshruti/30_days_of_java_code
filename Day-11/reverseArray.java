//Java program to reverse an array element

import java.util.*;

public class reverseArray
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("\n Given array is : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }

        reversedArray(arr);
        System.out.println("\n\n Reversed array is : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }

    }

    public static void reversedArray(int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while(start < end)
        {
            int temp = 0;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}