package stad23;

import java.util.ArrayList;

public class ArrayListFunction
{
    public static void main(String[] args)
    {
        // Create first ArrayList
        ArrayList<String> fruits1 = new ArrayList<>();

        // 1. add() - Add elements to list1
        fruits1.add("Apple");
        fruits1.add("Banana");
        System.out.println("Fruits1 after add(): " + fruits1);

        // 2. addAll() - Add all elements from another list
        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("Mango");
        fruits2.add("Orange");
        fruits1.addAll(fruits2);
        System.out.println("Fruits1 after addAll(): " + fruits1);

        // 3. remove() - Remove a specific element
        fruits1.remove("Banana");
        System.out.println("Fruits1 after remove Banana: " + fruits1);

        // 4. removeAll() - Remove all elements from list2
        fruits1.removeAll(fruits2);
        System.out.println("Fruits1 after removeAll(Fruits2): " + fruits1);

        // 5. contains() - Check if "Apple" is in the list
        System.out.println("Does Fruits1 contain Apple " + fruits1.contains("Apple"));

        // 6. size() - Print size of the list
        System.out.println("Size of Fruits1: " + fruits1.size());
    }
}
