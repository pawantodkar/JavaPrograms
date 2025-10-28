package stad7;

public class DataRetrieveForLoop
{
    public static void main(String[] args)
    {
        String[] studentName = {"Akash", "Shubham", "Niraj"};

        for(int i = 0; i < studentName.length; i++)
        {
            System.out.println("Student Name at index " + i + " is " + studentName[i]);
        }
    }
}
