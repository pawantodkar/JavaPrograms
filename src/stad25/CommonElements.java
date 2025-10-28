package stad25;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements
{
    public static void main(String[] args)
    {
        // Create an ArrayList with some integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Create a HashMap with Integer keys
        HashMap<Integer, String> map = new HashMap<>();
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(50, "Fifty");

        // Print common elements between ArrayList and HashMap keys
        System.out.println("Common elements present in both ArrayList and HashMap keys are: ");

        for (Integer item : list)
        {
            if (map.containsKey(item))
            {
                System.out.println(item);
            }
        }
    }
}
