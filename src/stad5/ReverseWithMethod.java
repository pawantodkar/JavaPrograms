package stad5; // package is lowercase

public class ReverseWithMethod // class is Pascal case
{
    public static void reverseNumber(int num) // method is camel case and verb
    {
        int rev = 0;

        while (num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number is: " + rev);
    }

    public static void main(String[] args)
    {
        reverseNumber(-1234);
    }
}
