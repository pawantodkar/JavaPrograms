package stad3;

public class SwitchCalculatorWithMethod
{
    public void SwitchCalculator(int n1, int n2, char operator)
    {
        switch (operator)
        {
            case '+':
                System.out.println("Addition: " + (n1 + n2));
                break;

            case '-':
                System.out.println("Subtraction: " + (n1 - n2));
                break;

            case '*':
                System.out.println("Multiplication: " + (n1 * n2));
                break;

            case '/':
                System.out.println("Division: " + (n1 / n2));
                break;
        }
    }

    public static void main(String[] args)
    {
        SwitchCalculatorWithMethod calculator = new SwitchCalculatorWithMethod();

        calculator.SwitchCalculator(10,20,'*');
    }
}
