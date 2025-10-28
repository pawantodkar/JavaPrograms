package stad22;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties
{
    public static void main(String[] args) throws IOException
    {
        Properties properties = new Properties();
        try
        {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\pawan\\IdeaProjects\\Stad_Solution");
            properties.load(fileInputStream);

            String dburl = properties.getProperty("db.url");
            System.out.println(dburl);

            String baseUrl = properties.getProperty("baseUrl");
            System.out.println(baseUrl);

            String api = properties.getProperty("api.test.post");
            System.out.println(api);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
