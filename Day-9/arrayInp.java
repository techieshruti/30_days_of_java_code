// taking input and output from array

import java.util.*;

public class arrayInp
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int marks[] = new int[5];
        int rollno[] = new int[5];

        System.out.println("Enter full name of an student : ");
        String name = scn.nextLine();
        System.out.println("Enter Roll No : ");
        rollno[0] = scn.nextInt();
        System.out.println("Enter marks of Maths : ");
        marks[0] = scn.nextInt();
        System.out.println("Enter marks of Physics : ");
        marks[1] = scn.nextInt();
        System.out.println("Enter marks of Chemistry : ");
        marks[2] = scn.nextInt();

       }
}