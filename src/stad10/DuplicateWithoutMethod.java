package stad10;

public class DuplicateWithoutMethod
{
    public static void main(String[] args)
    {
        int[] arr = {6, 8, 6, 7, 4, 4}; // array declare

        System.out.println("Duplicate elements are: ");

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
