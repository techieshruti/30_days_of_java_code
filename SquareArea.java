//Calculate the area of the square
import java.util.Scanner;

public class SquareArea
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side of square :");
        float s = scn.nextFloat();
        float area = s*s;
        System.out.println("Area of square is :" + area);
    }
}