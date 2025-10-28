package stad10;

public class MaxMinWithoutMethod
{
    public static void main(String[] args)
    {
        // Declare and initialize array
        int[] numbers = {11, 35, 3, 78, 31, 51};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > max) // If current element is greater than max, update max
            {
                max = numbers[i];
            }

            if (numbers[i] < min) // If current element is smaller than min, update min
            {
                min = numbers[i];
            }
        }

        System.out.println("Maximum: " + max); // Print the maximum and minimum values
        System.out.println("Minimum: " + min);
    }
}
