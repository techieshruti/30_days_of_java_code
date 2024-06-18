//java program to find first repeated element

import java.util.*;

public class firstRepeated
{
    public static int findFirstRepeatedElement(int arr[])
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
      int arr[] = {2, 5, 2, 5, 6, 4, 8, 5, 2, 5, 6, 4, 5};
      System.out.println("\n Given array is :");
      for(int i=0; i<arr.length; i++)
      {
        System.out.print(" "+arr[i]);
      }

      int res = findFirstRepeatedElement(arr);

      if(res == -1)
      {
        System.out.println("\nNo repeated number found!!");
      }
      else
      {
        System.out.println("\nFirst repeated element is :"+res);
      }
    }
}