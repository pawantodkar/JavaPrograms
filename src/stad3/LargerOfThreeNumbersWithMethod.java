package stad3;

public class LargerOfThreeNumbersWithMethod
{
    public void LargerOfThree(int n1, int n2, int n3)
    {
        if (n1 >= n2 && n1 >= n3)
        {
            System.out.println("Largest number is: " + n1);
        }
        else if (n2 >= n1 && n2 >= n3)
        {
            System.out.println("Largest number is: " + n2);
        }
        else
        {
            System.out.println("Largest number is: " + n3);
        }
    }

    public static void main(String[] args)
    {
        LargerOfThreeNumbersWithMethod larger = new LargerOfThreeNumbersWithMethod();
        larger.LargerOfThree(1,2,3);
    }
}
