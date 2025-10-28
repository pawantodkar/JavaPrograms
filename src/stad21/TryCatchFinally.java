package stad21;

public class TryCatchFinally
{
    public static void main(String[] args)
    {
        int[] ages = {21, 15, 30};

        try
        {
            // Accessing an invalid index to generate an exception
            int age = ages[3]; // This will cause ArrayIndexOutOfBoundsException

            if (age >= 18)
            {
                System.out.println("You are eligible to vote");
            }
            else
            {
                System.out.println("You are not eligible to vote");
            }

        }
        catch (Exception e)
        {
            // Catching the runtime exception
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally
        {
            // Always runs
            System.out.println("Voting eligibility process completed.");
        }
    }
}
