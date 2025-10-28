package stad9;

public class BubbleSortWithoutMethod
{
    public static void main(String[] args)
    {
        int[] arr = {7, 2, 5, 3, 1}; // Input Array

        System.out.println("Before sorting:");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        int n = arr.length; // Length of array

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1]) // swap if current element is greater than next
                {
                    int temp = arr[j]; // temp variable to hold value during swap
                    arr[j] = arr[j + 1]; // assign next element to current
                    arr[j + 1] = temp; // assign temp to next element
                }
            }
        }

        System.out.println("After sorting:");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
