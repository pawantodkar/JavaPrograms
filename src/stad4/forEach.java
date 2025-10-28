package stad4;

public class forEach
{
    public static void main(String[] args)
    {
        System.out.println("Using for-each loop:");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int num : numbers)
        {
            System.out.print(num + " ");
        }
    }
}
