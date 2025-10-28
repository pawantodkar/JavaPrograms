package stad24;

import java.util.LinkedList;

public class LinkedListUsage
{
    public static void main(String[] args)
    {
        // Create a LinkedList of Strings
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to the LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Elephant");

        // Display elements
        System.out.println("Animals List: " + animals);

        // Call LinkedList methods
        System.out.println("Element at index 2: " + animals.get(2));        // get()

        animals.set(1, "Lion");                                             // set()
        System.out.println("List after setting index 1 to Lion: " + animals);

        // Clear the LinkedList
        animals.clear();                                                    // clear()
        System.out.println("List after clear: " + animals);
    }
}
