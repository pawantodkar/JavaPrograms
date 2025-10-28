package stad5; // package is lowercase

public class ReverseWithoutMethod // class is Pascal case
{
    public static void main(String[] args)
    {
        int num = 9876;
        int rev = 0;

        while(num > 0)
        {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        System.out.println("Reversed inputNum is: " + rev);
    }
}
