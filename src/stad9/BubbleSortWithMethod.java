package stad9;

public class BubbleSortWithMethod
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

   static void printArray(int[] arr)
   {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {6, 2, 9, 3, 7};
        System.out.println("Before sorting:");
        printArray(arr);

        bubbleSort(arr);  // Call the method created above

        System.out.println("After sorting:");
        printArray(arr);
    }
}
