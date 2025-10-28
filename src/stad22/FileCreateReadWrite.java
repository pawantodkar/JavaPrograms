package stad22;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateReadWrite
{
    public static void main(String[] args)
    {
        // Define File class datatype (non-primitive)
        File myFile = new File("C:\\STAD Solutions\\Java\\Demo.txt");

        try
        {
            //  1: File creation
            if (myFile.createNewFile())
            {
                System.out.println("New file created: " + myFile.getName());
            }
            else
            {
                System.out.println("File already exists");
            }

            // 2: Writing to file
            FileWriter writer = new FileWriter(myFile);
            writer.write("Pawan Todkar is student at STAD");
            writer.close();

            // 3: Reading from file
            FileReader reader = new FileReader(myFile);
            int read;
            while ((read = reader.read()) != -1)
            {
                System.out.print((char) read);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error occurred " + e.getMessage());
        }
    }
}
