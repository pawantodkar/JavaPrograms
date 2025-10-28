package stad19;

public class ReversePalindrome
{
    public static void main(String[] args)
    {
        String original = "malayalam"; // original string
        String reverse = "";           // empty string to store reverse

        for (int i = original.length() - 1; i >= 0; i--)
        {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reverse);

        if (original.equals(reverse)) // check if original and reverse strings are equal
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }
    }
}
