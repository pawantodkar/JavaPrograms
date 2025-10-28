package stad3; // package is lowercase

public class SwapUsingThirdVariable // class is Pascal case
{
    public static void main(String[] args)
    {
        int num1 = 10; // variable is camel case (starts with lower case) and describes what the variable holds
        int num2 = 20;

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping using third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
