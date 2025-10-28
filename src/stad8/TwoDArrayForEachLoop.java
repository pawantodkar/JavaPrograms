package stad8;

public class TwoDArrayForEachLoop
{
    public static void main(String[] args)
    {
        int[][] array = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90} };

        for (int[] row : array)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
