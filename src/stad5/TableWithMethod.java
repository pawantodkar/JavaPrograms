package stad5; // package is lowercase

public class TableWithMethod // class is Pascal case
{
    public static void printTable(int num) // method is camel case and verb
    {
        System.out.println("Table of " + num + ":");

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args)
    {
        printTable(9);
    }
}
