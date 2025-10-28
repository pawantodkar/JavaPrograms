package stad10;

public class MaxMinWithMethod
{
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

    public static void main(String[] args)
    {
        int[] numbers = {88, 46, 23, 76, 31, 52};
        findMaxMin(numbers); // calling method to find max and min
    }
}
