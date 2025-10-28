package stad2;

public class SumDifference
{
    // Sum with parameters
    public static void sumWithParams(int a, int b)
    {
        System.out.println("Sum with parameters: " + (a + b));
    }

    // Difference with parameters
    public static void diffWithParams(int a, int b)
    {
        System.out.println("Difference with parameters: " + (a - b));
    }

    // Sum without parameters
    public static void sumWithoutParams()
    {
        int a = 7;
        int b = 3;
        System.out.println("Sum without parameters: " + (a + b));
    }

    // Difference without parameters
    public static void diffWithoutParams()
    {
        int a = 7;
        int b = 3;
        System.out.println("Difference without parameters: " + (a - b));
    }

    public static void main(String[] args)
    {
        // Call methods with parameters
        sumWithParams(10, 5);
        diffWithParams(10, 5);

        // Call methods without parameters
        sumWithoutParams();
        diffWithoutParams();
    }
}
