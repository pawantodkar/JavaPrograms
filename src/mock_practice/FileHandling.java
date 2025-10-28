package mock_practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\pawan\\IdeaProjects\\Stad_Solution\\FileHandling\\Demo.txt");

        try
        {
            if (file.createNewFile())
            {
                System.out.println("File created successfully with name: " + file.getName());
            }
            else
            {
                System.out.println("File already exists");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Hello Stad");
            writer.close();
            System.out.println("Data written successfuly");

            FileReader reader = new FileReader(file);
            int c;
            while ((c = reader.read()) != -1)
            {
                System.out.print((char) c);
            }
            reader.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
