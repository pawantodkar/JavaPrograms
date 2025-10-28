package stad21;

public class ThrowAndThrows
{
    public static void main(String[] args) throws Exception
    {
        int age = 15; // Initialize age variable

        if (age < 18) // Check if the age is less than 18
        {
            // If age is less than 18, throw an ArithmeticException
            throw new ArithmeticException("Age is less than 18 years, so you are not eligible to vote");
        }
        else
        {
            // If age is 18 or more, print eligibility message
            System.out.println("Ypu are eligible to vote");
        }
    }
}
