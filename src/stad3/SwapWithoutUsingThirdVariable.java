package stad3; // package is lowercase

public class SwapWithoutUsingThirdVariable // class is Pascal case
{
    public static void main(String[] args)
    {
        int num1 = 10; // variable is camel case (starts with lower case) and describes what the variable holds
        int num2 = 20;

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping without using third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
