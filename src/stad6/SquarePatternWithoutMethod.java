package stad6; // package is lowercase

public class SquarePatternWithoutMethod // class is Pascal case
{
    public static void main(String[] args)
    {
        int rows = 4; // variable is camel case (starts with lower) and describes what the variable holds
        int cols = 4;

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= cols; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
