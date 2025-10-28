package stad3; // package is lowercase

public class LeapYear // class is Pascal case
{
    public static void main(String[] args)
    {
        int inputYear = 2026; // variable is camel case and describes what the variable holds

        if ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0))
        {
            System.out.println(inputYear + " is a Leap Year");
        }
        else
        {
            System.out.println(inputYear + " is Not a Leap Year");
        }
    }
}
