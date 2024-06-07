/*Function is a block of code which can be called by main function. values can be passed into a function which perform some task into function definition and return a value to the called funtion.

Values passed in function call are known as arguments or actual parameters and values passed in function definition are known as formal parameters or parameters.

In java all function works on always call by value.
*/

import java.util.*;

public class product
{
    public static int multiply(int a, int b)
    {
        int prod = a * b;
        return prod;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = scn.nextInt();
        System.out.println("Enter second number : ");
        int b = scn.nextInt();
        int multi = multiply(a,b);
        System.out.println("Product is : " + multi);
    }
}
