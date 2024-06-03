//Keep entering numbers untill user enter multiple to 10
import java.util.*;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        do
        {
            int num = scn.nextInt();
            if(num % 10 == 0)
            {
                break;
            }
            System.out.println(num);
        }
        while(true);
    }
}