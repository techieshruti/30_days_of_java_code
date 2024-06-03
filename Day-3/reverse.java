//Print reverse of number 
import java.util.*;

public class reverse
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("\nEnter any number you want to reverse :");
        int num = scn.nextInt();

        while(num > 0)
        {
            int lastDigit = num % 10; //fetch the last digit
            System.out.print(lastDigit);
            num = num / 10;
        }
    }
}