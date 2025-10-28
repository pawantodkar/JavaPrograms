package stad18;

public class StringConstantPool
{
    public static void main(String[] args)
    {
        // String literals – stored in String Constant Pool
        String str1 = "Hello";
        String str2 = "Hello";

        // Using new keyword – creates a new object
        String str3 = new String("Hello");

        // Comparing references
        System.out.println("str1 == str2: " + (str1 == str2)); // true – same
        System.out.println("str1 == str3: " + (str1 == str3)); // false – different
    }
}
