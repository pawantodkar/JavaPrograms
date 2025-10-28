package stad24;

import java.util.HashSet;

public class HashSetUsage
{
    public static void main(String[] args)
    {
        // Create a HashSet of Strings
        HashSet<String> cities = new HashSet<>();

        // Add elements to the HashSet
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Bangalore");

        // Display elements
        System.out.println("Cities List: " + cities);

        // Call HashSet methods
        System.out.println("List Size: " + cities.size());                       // size()
        System.out.println("List Contains Delhi: " + cities.contains("Delhi"));  // contains()

        cities.remove("Bangalore");
        System.out.println("List after removing Bangalore: " + cities);          // remove()

        // Clear the HashSet
        cities.clear();                                                          // clear()
        System.out.println("HashSet after clear: " + cities);
    }
}
