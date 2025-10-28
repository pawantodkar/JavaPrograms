package stad25;

import java.util.HashMap;

public class DuplicateElementHashMap
{
    public static void main(String[] args)
    {
        int[] arr = {3, 2, 1, 2, 4, 1, 5}; // Declare and initialize an array

        HashMap<Integer, Integer> map = new HashMap<>(); // Create a HashMap to store elements and their counts

        for (int i = 0; i < arr.length; i++)
        {
            if (map.containsKey(arr[i])) // If the element is already in the map, increment its count
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else                        // If the element is not in the map, add it with count 1
            {
                map.put(arr[i], 1);
            }
        }

        System.out.println("Duplicate elements:");

        for (int key : map.keySet())
        {
            if (map.get(key) > 1) // If an element appears more than once, it is a duplicate
            {
                System.out.println(key);
            }
        }
    }
}
