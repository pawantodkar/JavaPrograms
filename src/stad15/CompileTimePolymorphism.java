package stad15;

public class CompileTimePolymorphism
{
    // Number of Arguments
    void display(String name1)
    {
        System.out.println("Employee Name1: " + name1);
    }

    void display(String name1, String name2)
    {
        System.out.println("Employee Name1: " + name1 + " and Employee Name2: " + name2);
    }

    // Type and Order of Arguments
    void display(String companyName, int age)
    {
        System.out.println("Company Name: " + companyName + " and Age: " + age);
    }
    void display(int age, String companyName)
    {
        System.out.println("Age: " + age + " and Company Name: " + companyName);
    }
    public static void main(String[] args)
    {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();

        obj.display("Pawan");
        obj.display("Pawan", "Akash");
        obj.display("AQM Technologies", 27);
        obj.display(27, "AQM Technologies");
    }
}
