package stad10;

import java.util.Arrays;

public class MaxMin2ndWithoutMethod
{
    public static void main(String[] args)
    {
        int[] arr = {13, 11, 46, 87, 98, 43}; // array declare
        Arrays.sort(arr);

        System.out.println("2nd max is: " + arr[arr.length-2]); // print 2nd max
        System.out.println("2nd min is: " + arr[1]);            // print 2nd min
    }
}
