// Java Program to merge two array

import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args)
    {
        int a[] = { 10, 20, 30, 40 };
        System.out.println("First array is :");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        } 
        
        int b[] = { 50, 60, 70, 80 };
        System.out.println("\nSecond array is :");
        for (int i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + " ");
        } 

        // determines length of firstArray
        int a1 = a.length;
      
        // determines length of secondArray
        int b1 = b.length;
      
        // resultant array size
        int c1 = a1 + b1;

        //resultant array
        int[] c = new int[c1];

        
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);

        
        System.out.println("\nMerged Array is : " + Arrays.toString(c));
    }
}
