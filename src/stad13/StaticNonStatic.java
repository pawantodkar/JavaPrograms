package stad13;

public class StaticNonStatic
{
    // Static method
    public static void displayStatic()
    {
        System.out.println("This is a static method.");
    }

    // Non-static method
    public void displayNonStatic()
    {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args)
    {
        // Calling static method directly using class name
        StaticNonStatic.displayStatic();

        // Creating object to call non-static method
        StaticNonStatic nonStaticObj = new StaticNonStatic();
        nonStaticObj.displayNonStatic();
    }
}
