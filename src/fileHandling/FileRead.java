package fileHandling;

import java.io.FileReader;

public class FileRead
{
    public static void main(String[] args)
    {
        try
        {
            FileReader reader = new FileReader("C:\\Users\\pawan\\IdeaProjects\\Stad_Solution\\FileHandling\\Demo.txt");
            int ch;
            while ((ch = reader.read()) != -1)
            {
                System.out.print((char) ch);
            }
            reader.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
