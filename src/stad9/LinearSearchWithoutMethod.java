package stad9;

public class LinearSearchWithoutMethod
{
    public static void main(String[] args)
    {
        String[] names = {"Shubham", "Akash", "Rahul", "Rohan", "Prakash"}; // Array names
        String name = "Rahul"; // name to be searched for

        boolean found = false; // to check if element is found

        for (int i = 0; i < names.length; i++)
        {
            if (names[i] == name)
            {
                System.out.println(name + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) // to check if element is not found
        {
            System.out.println(name + " not found in array.");
        }
    }
}
