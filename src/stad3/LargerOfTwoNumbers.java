package stad3; // package is lowercase

public class LargerOfTwoNumbers // class is Pascal case
{
    public static void main(String[] args)
    {
        int num1 = 100; // variable is camel case and describes what the variable holds
        int num2 = 250;

        if (num1>num2)
        {
            System.out.println("Larger number is: " + num1);
        }
        else
        {
            System.out.println("Larger number is: " + num2);
        }
    }
}
