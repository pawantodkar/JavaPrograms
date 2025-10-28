package stad13;

public class ReturnNoReturn
{
    // Method with no return type (void)
    void displayMessage()

    {
        System.out.println("This is a non-return type method.");
    }

    // Method with return type (int)
    int addition(int a, int b)

    {
        return a + b;
    }

    public static void main(String[] args)
    {
        ReturnNoReturn obj = new ReturnNoReturn();

        // Calling non-return type method
        obj.displayMessage();

        // Calling return type method and storing result
        int sum = obj.addition(76, 86);
        System.out.println("This is a return type method and sum is: " + sum);
    }
}
