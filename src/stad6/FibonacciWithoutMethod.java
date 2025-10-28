package stad6; // package is lowercase

public class FibonacciWithoutMethod // class is Pascal case
{
    public static void main(String[] args)
    {
        int endPoint = 10; // variable is camel case and describes what the variable holds
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series: " + num1 + " " + num2);

        for (int i = 2; i < endPoint; i++)
        {
            int temp = num1 + num2;
            System.out.print(" " + temp);
            num1 = num2;
            num2 = temp;
        }
    }
}
