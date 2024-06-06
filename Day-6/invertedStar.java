import java.util.*;

public class invertedStar
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of lines you want to print '*' : ");
        int num = scn.nextInt();
        
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}