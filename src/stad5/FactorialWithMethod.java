package stad5; // package is lowercase

public class FactorialWithMethod // class is Pascal case
{
    public static void findFactorial(int num) // method is camel case and verb
    {
        int factNum = 1; // variable is camel case and describes what the variable holds

        for(int i = 1; i <= num; i++)
        {
            factNum = factNum * i;
        }

        System.out.println("Factorial of " + num + " is: " + factNum);
    }

    public static void main(String[] args)
    {
        findFactorial(7);
    }
}
