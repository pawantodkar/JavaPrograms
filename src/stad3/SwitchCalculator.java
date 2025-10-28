package stad3; // package is lowercase

public class SwitchCalculator // class is Pascal case
{
    public static void main(String[] args)
    {
        int num1 = 12; // variable is camel case (starts with lower case) and describes what the variable holds
        int num2 = 6;
        char operator = '/';

        switch (operator)
        {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                {
                    System.out.println("Division: " + (num1 / num2));
                }
                else
                {
                    System.out.println("Cannot divide by zero");
                }
                break;
        }
    }
}
