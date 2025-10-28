package stad9;

public class LinearSearchWithMethod
{
    static void linearSearch(String[] arr, String key) // created method to call in main method
    {
        boolean found = false; // to check if element is found

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
            {
                System.out.println(key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) // to check if element is not found
        {
            System.out.println(key + " not found in array.");
        }
    }

    public static void main(String[] args)
    {
        String[] names = {"Shubham", "Akash", "Rahul", "Rohan", "Prakash"}; // Array names
        String name = "Rahul"; // name to be searched for

        linearSearch(names, name);
    }
}
