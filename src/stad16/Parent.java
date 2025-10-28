package stad16;

public class Parent
{
    String role = "Parent";

    Parent()
    {
        System.out.println("Parent Constructor");
    }

    void message()
    {
        System.out.println("Message from Parent class");
    }
}

class Child extends Parent
{
    String role = "Child";

    Child()
    {
        super();
        System.out.println("Child Constructor");
    }

    void show()
    {
        System.out.println("Role from Parent: " + super.role); // use of variable
        super.message(); // calls parent class method
        System.out.println("Role from Child: " + role);
    }

    public static void main(String[] args)
    {
        Child obj = new Child(); // use of constructor
        obj.show();
    }
}
