package stad5; // package is lowercase

public class PalindromeWithoutMethod // class is Pascal case
{
    public static void main(String[] args)
    {
        int num = 4567;
        int original = num;
        int rev = 0;

        while(num > 0)
        {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        if(rev == original)
        {
            System.out.println(original + " is a Palindrome num.");
        } else {
            System.out.println(original + " is NOT a Palindrome num.");
        }
    }
}
