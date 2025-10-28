package stad14;

public class ParentChildCall
{
    public static void main(String[] args)
    {
        EmployeeDetails obj = new EmployeeDetails(); // Common Object for both Parent and Child Class
        obj.etlTesting();                            // Parent Class Call
        obj.showDetails(123, "Pawan Todkar"); // Child Class Call
    }
}
