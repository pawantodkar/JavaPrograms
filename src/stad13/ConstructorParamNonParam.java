package stad13;

public class ConstructorParamNonParam
{
    // Non-parameterized constructor
    ConstructorParamNonParam()
    {
        System.out.println("This is a non-parameterized constructor.");
    }

    // Parameterized constructor
    ConstructorParamNonParam(String name, int age)
    {
        System.out.println("This is a parameterized constructor " + "Name is " + name + " and " + "Age is " + age );
    }

    public static void main(String[] args)
    {
        // Calling non-parameterized constructor
        ConstructorParamNonParam obj1 = new ConstructorParamNonParam();

        // Calling parameterized constructor
        ConstructorParamNonParam obj2 = new ConstructorParamNonParam("Pawan", 27);
    }
}
