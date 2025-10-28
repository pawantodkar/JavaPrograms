package stad24;

import java.util.ArrayList;

public class ArrayListUsage
{
    public static void main(String[] args)
    {
        // Create an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add elements to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Display elements
        System.out.println("Colors List: " + colors);

        // Call ArrayList methods
        System.out.println("Number of elements present in the list: " + colors.size());                    // size()
        System.out.println("Element at index 2 of List: " + colors.get(2));      // get()
        System.out.println("List Contains Green: " + colors.contains("Green")); // contains()

        colors.set(1, "Orange"); // set() - replace element at index 1          // set()
        System.out.println("List After set index 1 to Orange: " + colors);

        colors.remove("Blue"); // remove() by value                          // remove()
        System.out.println("List after removing Blue: " + colors);

        colors.removeFirst(); // remove() by index
        System.out.println("List after removing index 0: " + colors);

        // Clear the list
        colors.clear();                                                        // clear()
        System.out.println("List after clear: " + colors);
    }
}
