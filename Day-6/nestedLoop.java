import java.util.*;

public class nestedLoop
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of lines you want to print '*' : ");
        int num = scn.nextInt();
        
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}