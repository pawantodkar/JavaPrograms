package stad18;

public class StringCreate
{
    public static void main(String[] args)
    {
        // a. Using Character Array
        char[] charArray = {'P', 'A', 'W', 'A', 'N'};
        String CharArray = new String(charArray);
        System.out.println("String using character array: " + CharArray);

        // b. Using new Keyword
        String strNew = new String("Welcome");
        System.out.println("String using new keyword: " + strNew);

        // c. Using String Literal
        String strLiteral = "Java Programming";
        System.out.println("String using literal: " + strLiteral);
    }
}
