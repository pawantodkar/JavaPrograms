package stad17;

public class NormalClass // Normal Class
{
    // final variable
    final int age;
    final static int MAX_LIMIT = 100;

    // Constructor
    NormalClass(int age)
    {
        this.age = age;
    }

    // final method
    final void showDetails()
    {
        System.out.println("Age is: " + age);
        System.out.println("Max Limit is: " + MAX_LIMIT);
    }
}
