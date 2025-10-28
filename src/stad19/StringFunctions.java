package stad19;

public class StringFunctions
{
    public static void main(String[] args)
    {
        String name = "Stad Solution";
        System.out.println("Original String: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Character at index 2: " + name.charAt(2));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Contains 'Sol': " + name.contains("Sol"));
        System.out.println("Equals 'Stad Solution': " + name.equals("Stad Solution"));
        System.out.println("EqualsIgnoreCase 'Stad Solution': " + name.equalsIgnoreCase("stad solution"));
    }
}
