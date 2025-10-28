package stad3; // package is lowercase

public class LargerOfThreeNumbers // class is Pascal case
{
    public static void main(String[] args)
    {
        int num1 = 30; // variable is camel case and describes what the variable holds
        int num2 = 20;
        int num3 = 25;

        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println("Largest number is: " + num1);
        }
        else if (num2>=num1 && num2>=num3)
        {
            System.out.println("Largest number is: " + num2);
        }
        else
        {
            System.out.println("Largest number is: " + num3);
        }
    }
}
