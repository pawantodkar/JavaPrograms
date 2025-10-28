package fileHandling;

import java.io.File;

public class FileCreate
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\pawan\\IdeaProjects\\Stad_Solution\\FileHandling\\Demo.txt");

        try
        {
            if (file.createNewFile())
            {
                System.out.println("File created successfully with name " + file.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
