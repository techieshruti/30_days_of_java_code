import java.util.*;

public class updateMarks
{
    public static int[] update(int marks[])
    {
        for(int i=0; i<marks.length; i++)
        {
            marks[i]+=1;
        }
        return marks;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);  //creating object of scanner class
        int marks[] = new int[3];              //initialized array
        System.out.println("Enter marks of Maths : ");
        marks[0] = scn.nextInt();              //Taking input from user
        System.out.println("Enter marks of Physics : ");
        marks[1] = scn.nextInt();              //Taking input from user
        System.out.println("Enter marks of Chemistry : ");
        marks[2] = scn.nextInt();              //Taking input from user
        
        // Print original marks
        for(int i=0; i<marks.length; i++)
        {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        
        // Update marks
        int updatedMarks[] = update(marks);

        // Print updated marks
        System.out.println("Updated marks:");
        for (int i = 0; i < updatedMarks.length; i++) 
        {
            System.out.print(updatedMarks[i] + " ");
        }
    }
}