import java.util.*;

public class Calculator
{
    public static void main(String args[])
     {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number :");
        float num1 = scn.nextFloat();
        System.out.print("Enter second number :");
        float num2 = scn.nextFloat();
        System.out.print("Enter operator :");
        char ooperator = scn.next().charAt(0);
        switch(ooperator)
        {
            case '+' : System.out.println("Addition : " + (num1 + num2));
            break;
            case '-' : System.out.println("Subtraction : " + (num1 - num2));
            break;
            case '*' : System.out.println("Multiplication : " + (num1 * num2));
            break;
            case '/' : System.out.println("Division : " + (num1 / num2));
            break;
            case '%' : System.out.println("Remainder : " + (num1 % num2));
            break;
            default : System.out.println("Invalid Operator");
        }
    }
}