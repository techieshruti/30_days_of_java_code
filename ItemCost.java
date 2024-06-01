// Take 3 inputs from user. output the total cost of the items back to the user. adding 18% gst tax to the items
import java.util.Scanner;

public class ItemCost
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the cost of Pencil :");
        float pencil = scn.nextFloat();
        float pencilGst= pencil+0.18f; 

        System.out.println("Enter the cost of Pen :");
        float pen = scn.nextFloat();
        float penGst= pen+0.18f;

        System.out.println("Enter the cost of Eraser :");
        float Eraser = scn.nextFloat();
        float eraserGst= Eraser+0.18f;

        System.out.println("====================");
        System.out.println("Items        Cost");
        System.out.println("====================");
        System.out.println("Pencil       " +pencilGst);
        System.out.println("Pen          " +penGst);
        System.out.println("Erasor       " +eraserGst);
        System.out.println("====================");
    }
}