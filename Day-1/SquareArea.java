//Calculate the area of the square
import java.util.Scanner;

public class SquareArea
{
    public static void main(String[] args)
    {
        //take input from user
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side of square :");
        float s = scn.nextFloat();

        //calculate area
        float area = s*s;

        //display area on console
        System.out.println("Area of square is :" + area);
    }
}