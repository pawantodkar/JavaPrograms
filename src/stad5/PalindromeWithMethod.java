package stad5; // package is lowercase

public class PalindromeWithMethod // class is Pascal case
{
    public static void checkPalindrome(int num) // method is camel case and verb
    {
        int original = num;
        int rev = 0;

        while(num != 0)
        {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        if(rev == original)
        {
            System.out.println(original + " is a Palindrome number.");
        }
        else
        {
            System.out.println(original + " is NOT a Palindrome number.");
        }
    }

    public static void main(String[] args)
    {
        checkPalindrome(-121);
    }
}
