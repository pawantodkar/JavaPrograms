package stad11;

import java.util.Arrays;

public class ArrayUtility
{
    public static void bubbleSort(int[] arr) // bubbleSort method created to call in main method
    {
        int n = arr.length; // Length of array

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1]) // if current element is greater than next, swap them
                {

                    int temp = arr[j];   // swapping arr[j] and arr[j+1]
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr)
    {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public void linearSearch(String[] arr, String key) // created method to call in main method
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

    public static void findDuplicates(int[] arr) // method created
    {
        System.out.print("Duplicate elements are: ");

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

    public void findSecondMaxMin(int[] arr) // Method to find and print second max and second min
    {
        Arrays.sort(arr);  // Sort the array

        System.out.println("\n2nd Maximum is: " + arr[arr.length - 2]);
        System.out.println("2nd Minimum is: " + arr[1]);
    }

    public static void findMaxMin(int[] arr)
    {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)  // if current element is greater than max, update max
            {
                max = arr[i];
            }
            if (arr[i] < min) // if current element is smaller than min, update min
            {
                min = arr[i];
            }
        }

        System.out.println("Maximum: " + max); // print maximum number
        System.out.println("Minimum: " + min); // print minimum number
    }
}
