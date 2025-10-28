package stad5; // package is lowercase

public class FactorialWithoutMethod // class is pascal case
{
    public static void main(String[] args)
    {
        int inputNum = 5; // variable is camel case and
        int factNum = 1;  // describes what the variable holds

        for(int i = 1; i <= inputNum; i++)
        {
            factNum = factNum * i;
        }

        System.out.println("Factorial of " + inputNum + " is: " + factNum);
    }
}
