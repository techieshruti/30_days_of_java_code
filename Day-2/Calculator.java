import java.util.scanner;

public class Calculator
{
    public static void main(String[] args)

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number :");
        float num1 = scn.nextFloat();
        System.out.print("Enter second number :");
        float num2 = scn.nextFloat();
        char ooperator = scn.next().charAt(0);
        switch(ooperator)
        {
            case + : System.out.print("Addition :" + num1 + num2);
            break;
            case - : System.out.print("Subtraction :" + num1 - num2);
            break;
            case * : System.out.print("Multiplication :" + num1 * num2);
            break;
            case / : System.out.print("Division :" + num1 / num2);
            break;
            case % : System.out.print("Remainder :" + num1 % num2);
            break;
            default : System.out.print("Invalid Operator");
        }
    }
}