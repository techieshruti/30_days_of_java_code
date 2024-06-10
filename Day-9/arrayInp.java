// taking input and output from array

import java.util.*;

public class arrayInp
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);  //creating object of scanner class
        int marks[] = new int[5];              //initialized array
        int rollno[] = new int[5];             //initialized array

        System.out.println("Enter full name of an student : ");
        String name = scn.nextLine();          //Taking input from user
        System.out.println("Enter Roll No : ");
        rollno[0] = scn.nextInt();             //Taking input from user
        System.out.println("Enter marks of Maths : ");
        marks[0] = scn.nextInt();              //Taking input from user
        System.out.println("Enter marks of Physics : ");
        marks[1] = scn.nextInt();              //Taking input from user
        System.out.println("Enter marks of Chemistry : ");
        marks[2] = scn.nextInt();              //Taking input from user

        int percent = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage is : "+percent);
        }
}