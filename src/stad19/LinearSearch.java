package stad19;

public class LinearSearch
{
    public static void main(String[] args)
    {
        String[] arr = {"Pawan", "Todkar", "is", "Student", "at", "Stad"}; // define array

        String target = "Todkar"; // string to search

        boolean check = false;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].equals(target)) // compare each array
            {
                check = true;
                break;
            }
        }

        if (check)
        {
            System.out.println("String " + target + " exists in the array.");
        }
        else
        {
            System.out.println("String " + target + " does not exist in the array.");
        }
    }
}
