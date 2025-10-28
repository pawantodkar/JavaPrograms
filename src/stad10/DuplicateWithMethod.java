package stad10;

public class DuplicateWithMethod
{
    static void findDuplicates(int[] arr) // method created
    {
        System.out.println("Duplicate elements are: ");

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 5, 7, 7, 4, 4}; // array declare

        findDuplicates(arr); // method called
    }
}
