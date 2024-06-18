//java program to count number of occurrance of specific element by taking input from user

import java.util.*;

public class countOccurrence1
{
    
    public static int countOccurrence1(int arr[], int target)
    {
        int count =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter duplicate integers of your choice in array of 15 elements :");
        int arr[] = new int [15];
        for(int i=0; i<15; i++)
        {
            arr[i] = scn.nextInt(); //reading elements from user
        }
        System.out.println();
        for(int i=0; i<15; i++)
        {
            System.out.print(arr[i]); //display elements from user
        }
        System.out.println();
        System.out.println("Enter Target element you want to know the occurrence : ");
        int target = scn.nextInt();

        int res=countOccurrence1(arr, target);
        System.out.println(target+ " occurs "+ res + " times.");
    }
}