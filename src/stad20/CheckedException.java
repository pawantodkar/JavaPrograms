package stad20;

public class CheckedException
{
    public static void main(String[] args)
    {
        try
        {
            int n = 10/0;
            System.out.println(n);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
