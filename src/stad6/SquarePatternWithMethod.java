package stad6; // package is lowercase

public class SquarePatternWithMethod // class is Pascal case
{
    public static void main(String[] args)
    {
        int rows = 4, cols = 4; // variable is camel case (starts with lower) and describes what the variable holds
        printSquare(rows, cols);
    }

    static void printSquare(int rows, int cols) // method is camel case and verb
    {
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
