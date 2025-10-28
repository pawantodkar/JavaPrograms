package stad5; // package is lowercase

public class TableWithoutMethod // class is Pascal case
{
    public static void main(String[] args)
    {
        int num = 13;

        System.out.println("Table of " + num + ":");

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
