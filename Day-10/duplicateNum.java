//java program to check duplicate elements in array

import java.util.Arrays;

public class duplicateNum {
    public static void main(String[] args) {
        int[] arr = {5, 5, 2, 5, 2, 5, 6, 4, 8, 5, 2, 5, 6, 4, 5};
        
        System.out.println("\nGiven array is:");
        System.out.println(Arrays.toString(arr));

        int maxElement = 10000; // Assuming the maximum value in the array is 9999
        int[] occurrences = countOccurrences(arr, maxElement);
        
        // Print the occurrences of each element
        System.out.println("\nOccurrences of each element:");
        for (int i = 0; i <= maxElement; i++) {
            if (occurrences[i] > 0) {
                System.out.println("Element " + i + " occurs " + occurrences[i] + " times.");
            }
        }
        
        // Find and print the first repeated element
        int firstRepeated = findFirstRepeatedElement(arr, occurrences);
        if (firstRepeated != -1) {
            System.out.println("\nThe first repeated element is: " + firstRepeated);
        } else {
            System.out.println("\nNo repeated elements found.");
        }
    }

    public static int[] countOccurrences(int[] arr, int maxElement) {
        int[] countArray = new int[maxElement + 1];
        for (int num : arr) {
            countArray[num]++;
        }
        return countArray;
    }

    public static int findFirstRepeatedElement(int[] arr, int[] occurrences) {
        for (int num : arr) {
            if (occurrences[num] > 1) {
                return num;
            }
        }
        return -1; // Return -1 if no repeated element is found
    }
}
