//Print N Numbers from java
import java.util.*;

public class PrintNumbers
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter any number :");
        int n = scn.nextInt();
        System.out.println("numbers are :");
        
        while(count<=n)
        {
            System.out.println(count);
            count++;
        }
    }
}