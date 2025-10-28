package stad2;

public class Static_NonStatic
{
    // Static method
    public static void staticMethod()
    {
        System.out.println("Static method called");
    }

    // Non-static method
    public void nonStaticMethod()
    {
        System.out.println("Non-static method called");
    }

    public static void main(String[] args)
    {
        // Calling static method without using class name
        staticMethod();

        // Calling non-static method using class name
        Static_NonStatic obj = new Static_NonStatic();
        obj.nonStaticMethod();
    }
}
