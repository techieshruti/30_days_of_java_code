//Java program to clear ith bit 

import java.util.*;

public class clearIthBit
{
    public static void main(String[] args)
    {
        System.out.println(clearIthBit(10,2));
    }

    public static int clearIthBit(int n, int i)
    {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
}