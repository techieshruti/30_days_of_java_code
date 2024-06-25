//java program to find shortest path

import java.util.*;

public class findPath
{
    public static float getShortestPath(String path)
    {
        int x = 0;
        int y = 0;
        
        for(int i = 0; i<path.length(); i++)
        {
            char dir = path.charAt(i);
            //North direction
            if(dir == 'N')
            {
                x++;
            }
            else if(dir == 'S')
            {
                y--;
            }
            else if(dir == 'E')
            {
                x--;
            }
            else 
            {
                x++;
            }
            
        }
            int A = x*x;
            int B = y*y;

            return (float) Math.sqrt(A + B);
    }
    public static void main(String[] args)
    {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}