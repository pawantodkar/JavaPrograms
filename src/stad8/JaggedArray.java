package stad8;

public class JaggedArray
{
    public static void main(String[] args)
    {
        int[][] jagged = new int[3][];

        jagged[0] = new int[1];
        jagged[1] = new int[2];
        jagged[2] = new int[3];

        jagged[0][0] = 10;

        jagged[1][0] = 20;
        jagged[1][1] = 30;

        jagged[2][0] = 40;
        jagged[2][1] = 50;
        jagged[2][2] = 60;

        for (int i = 0; i < jagged.length; i++)
        {
            for (int j = 0; j < jagged[i].length; j++)
            {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
