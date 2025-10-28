package stad10;

import java.util.Arrays;

public class MaxMin2ndWithMethod
{
    public static void findSecondMaxMin(int[] arr) // Method to find and print second max and second min
    {
        Arrays.sort(arr);  // Sort the array

        System.out.println("2nd Maximum is: " + arr[arr.length - 2]);
        System.out.println("2nd Minimum is: " + arr[1]);
    }

    public static void main(String[] args)
    {
        int[] arr = {21, 65, 32, 57, 92, 41};

        findSecondMaxMin(arr); // Call method to find and print 2nd max and 2nd min
    }
}
