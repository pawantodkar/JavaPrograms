package stad7;

public class ArrayCreation
{
    public static void main(String[] args)
    {
        int[] empId = {1001, 1002, 1003, 1004, 1005};

        char[] empCode = {'A', 'B', 'C', 'D', 'E'};

        boolean[] isActive = {true, false, true, false, true};

        double[] salary = {15000.5, 25000.6, 35000.7, 45000.8, 55000.9};

        String[] empName = {"Rohan", "Navin", "Raj", "Rahul", "Karan"};

        for (int i = 0; i < empId.length; i++)
        {
            System.out.println("Employee ID " + empId[i] + " has salary of " + salary[i]);
        }
    }
}
