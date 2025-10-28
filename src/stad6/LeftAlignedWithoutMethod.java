package stad6; // package is lowercase

public class LeftAlignedWithoutMethod // package is lowercase
{
    public static void main(String[] args)
    {
        int rows = 5; // variable is camel case (starts with lower case) and describes what the variable holds

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
