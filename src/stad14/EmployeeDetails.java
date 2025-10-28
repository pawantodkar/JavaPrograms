package stad14;

// Child Class
public class EmployeeDetails extends Employee
{
    // Declare Employee ID and Employee Name
    int empID;
    String empName;

    // Parameterized Child Method
    void showDetails(int empID, String empName)
    {
        // Print Child Statement
        System.out.println("Employee ID is: " + empID);
        System.out.println("Employee Name is: " + empName);
    }
}
