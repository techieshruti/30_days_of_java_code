//java program to count number of occurrance of specific element

import java.util.*;

public class countOccurrence// class
{

    public static int countOccurrence(int arr[], int target) //method to check occurrence
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target)
            {
                count++;
            }
        }  
        return count;
    }

    public static void main(String[]args)
    {
        int arr[] = {1,2,3,4,5,2,2,3,3,3,4,4,2,3,5,6};
        int target = 4;

        int res= countOccurrence(arr, target);
        System.out.println(target+ " occurs "+ res + " times.");

    }
}