package stad12;

public class MissingElement
{
    public static int findMissing(int[] arr)
    {
        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }

        return (expectedSum - sum); // returns missing number
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 4, 5}; // declare array

        int missing = findMissing(arr); // call method

        System.out.println("Missing Element is: " + missing); // print missing element
    }
}
