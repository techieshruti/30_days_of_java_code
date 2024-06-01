import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        // Read inputs
        System.out.println("Enter first numbers :");
        int a = scn.nextInt();
        System.out.println("Enter second numbers :");
        int b = scn.nextInt();
        System.out.println("Enter 3rd numbers :");
        int c = scn.nextInt();
                
        // Calculate average
        int avg = (a+b+c)/3;
        
        // Display the result
        System.out.println("Average of 3: " + avg);
        
        // Close the scanner
        scn.close();
    }
}
