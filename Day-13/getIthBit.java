//Java program to get ith bit 

import java.util.*;

public class getIthBit
{
    public static void main(String[] args)
    {
        System.out.println(getIthBit(10,3));
    }

    public static int getIthBit(int n, int i)
    {
        int bitMask = 1<<i;
        if((n & bitMask) == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}