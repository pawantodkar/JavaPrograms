package stad20;

public class UncheckedException
{
    public static void main(String[] args)
    {
        try
        {
            int[] arr = {1,2,3};
            // accessing an index that does not exist for unchecked exception
            System.out.println("Value at index 5 is: " + arr[5]);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
