package stad17;

public class Static
{
    static int counter;

    static
    {
        counter = 100;
        System.out.println("Static Block executed " + counter);
    }
    static void incrementCounter()
    {
        counter++;
        System.out.println("Counter Incremented: " + counter );
    }

    public static void main(String[] args)
    {
        Static.incrementCounter();
        System.out.println("Counter: " + Static.counter);
    }
}
