package stad3;

public class EvenOddWithMethod
{
    public static void EvenOdd(int n)
    {
        if (n%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args)
    {
        EvenOddWithMethod.EvenOdd(3);
    }
}
