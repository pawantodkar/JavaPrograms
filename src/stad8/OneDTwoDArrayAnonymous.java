package stad8;

public class OneDTwoDArrayAnonymous
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
        print1DArray(new int[]{100, 200, 300}); // Anonymous 1-D array

        print2DArray(new int[][]{ {9, 8, 7}, {6, 5, 4}}); // Anonymous 2-D array
    }
}
