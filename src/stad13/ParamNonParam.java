package stad13;

public class ParamNonParam
{
    // Non-parameterized method
    void display()
    {
        System.out.println("Automation Testing at Stad Solution");
    }

    // Parameterized method
    void addition(int a, int b)
    {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args)
    {
        // Creating object of the class
        ParamNonParam obj = new ParamNonParam();

        // Calling non-parameterized method
        obj.display();

        // Calling parameterized method
        obj.addition(55, 75);
    }
}
