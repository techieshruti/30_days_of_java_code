//Java program to set ith bit 

import java.util.*;

public class setIthBit
{
    public static void main(String[] args)
    {
        System.out.println(setIthBit(10,2));
    }

    public static int setIthBit(int n, int i)
    {
        int bitMask = 1<<i;
        return n | bitMask;
    }
}