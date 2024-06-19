//Java program to to find element using binary search

import java.util.*;

public class binarySearch
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("\nGiven Array is :");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("\nEnter the element you want to check the index of : ");
        int key = scn.nextInt();
        
        int res = findElement(arr,key);

        if(res != -1)
        {
            System.out.println("\nIndex of key is :" + res);
        }
        else 
        {
            System.out.println("Key Not Found!!");
        }

    }

    public static int findElement(int arr[], int key)
    {
        int start = 0;        //initialize start of array to 0
        int end = arr.length-1;    //initialize end of array to elements -1
        while(start <= end)
        {
            int mid = (start + end) / 2;   //calculate mid
            //comparision
            if(arr[mid] == key)
            {
                return mid;
            }

            if(arr[mid] < key)
            {
                start = mid + 1;
            }
            else 
            {
                end = mid - 1;
            }
        }
        return -1;        
        
    }
}