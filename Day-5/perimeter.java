//Java Program to Find the Perimeter of a Rectangle
import java.util.*;

public class perimeter
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        float length = scn.nextFloat();
        System.out.println("Enter width of rectangle : ");
        float width = scn.nextFloat();

        float peri = 2 * (length + width);

        System.out.println("Perimeter of rectangle : "+ peri);
    }
}