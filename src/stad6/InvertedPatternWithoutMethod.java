package stad6; // package is lowercase

public class InvertedPatternWithoutMethod // class is Pascal case
{
    public static void main(String[] args)
    {
        int rows = 5; // variable is camel case and describes what the variable holds

        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
