package stad8;

public class OneDTwoDArrayNonAnonymous
{
    public static void print1DArray(int[] arr)
    {
        System.out.print("1-D Array: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void print2DArray(int[][] arr)
    {
        System.out.println("2-D Array:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int[] oneD = {10, 20, 30}; // Non-anonymous 1-D array
        print1DArray(oneD);

        int[][] twoD = { {1, 2}, {3, 4} }; // Non-anonymous 2-D array
        print2DArray(twoD);
    }
}
