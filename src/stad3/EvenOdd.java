package stad3; // package is lowercase

public class EvenOdd // class is Pascal case
{
    public static void main(String[] args)
    {
        int inputNum = 13; // variable is camel case and describes what the variable holds

        if (inputNum % 2 == 0) {
            System.out.println(inputNum + " is Even");
        }
        else
        {
            System.out.println(inputNum + " is Odd");
        }
    }
}
