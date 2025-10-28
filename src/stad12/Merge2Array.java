package stad12;

import java.util.Arrays;

public class Merge2Array
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5}; // declare array1
        int[] arr2 = {6,7,8,9,10,11,12}; // declare array2

        int[] merge = new int [arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++)
        {
            merge[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++)
        {
            merge[arr1.length+j] = arr2[j];
        }

        for (int k = 0; k < merge.length; k++)
        {
            System.out.println("Elements in merged arrays is: " + merge[k]);
        }

        Arrays.sort(merge); // sort in ascending order
        for (int k = 0; k < merge.length; k++)
        {
            System.out.println(merge[k]);
        }
    }
}
