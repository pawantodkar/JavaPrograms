package stad15;

public class RunTimePolymorphism extends CompileTimePolymorphism
{
    @Override
    void display(String name1)
    {
        super.display(name1);
    }

    @Override
    void display(String name1, String name2)
    {
        super.display(name1, name2);
    }

    @Override
    void display(int age, String companyName)
    {
        super.display(age, companyName);
    }

    @Override
    void display(String companyName, int age)
    {
        super.display(companyName, age);
    }

    public static void main(String[] args)
    {
        RunTimePolymorphism obj = new RunTimePolymorphism();
        obj.display("Pawan Todkar");
    }
}
