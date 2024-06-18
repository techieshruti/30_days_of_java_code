//Linear Search

import java.util.*;

public class linearSearch //class 
{
    public static String linearSearch(String list[], String key) //creating method to serach
    {
        for(int i=0; i<list.length; i++)
        {
            if(list[i].equals(key))
            {
               return "Item found at: " + i; 
            }
        }
        return "Not Found";
    }

    public static void main(String[]args)//main function
    {
        Scanner scn = new Scanner(System.in);
        String list[] = {"Coffee", "Chocolate", "Burger", "Ice-Cream", "Dosa", "Samosa", "Chowmin"};
        for(int i=0; i<list.length; i++)
        {
            System.out.println("\n* "+list[i]);
        }
        System.out.println();
        System.out.println("What do you want to search? ");
        String key = scn.nextLine();

        String index = linearSearch(list, key);
        System.out.println(index);
        
    }
}
