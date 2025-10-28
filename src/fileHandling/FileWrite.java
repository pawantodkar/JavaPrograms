package fileHandling;

import java.io.FileWriter;

public class FileWrite
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer = new FileWriter("C:\\Users\\pawan\\IdeaProjects\\Stad_Solution\\FileHandling\\Demo.txt");
            writer.write("Hello Stad Solution 2025");
            System.out.println("Data written successfully");
            writer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
