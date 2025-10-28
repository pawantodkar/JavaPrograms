package stad18;

public class StringImmutable
{
    public static void main(String[] args)
    {
        String original = "Hello";

        String modified = original.concat(" World");

        // Printing both strings
        System.out.println("Original String: " + original);   // Output: Hello
        System.out.println("Modified String: " + modified);   // Output: Hello World
    }
}
