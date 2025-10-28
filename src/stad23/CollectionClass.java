package stad23;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClass
{
    public static void main(String[] args)
    {
        // Create first ArrayList and add elements
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(12);
        list1.add(13);
        System.out.println(list1);

        // Create second ArrayList and add elements
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(23);
        list2.add(24);
        list2.add(25);
        System.out.println(list2);

        list1.addAll(list2);
        System.out.println(list1);

        Collections.sort(list1); // Sort the list in ascending order
        System.out.println(list1);

        Collections.reverse(list1); // Reverse the list (now in descending order)
        System.out.println(list1);

        System.out.println(Collections.max(list1)); // Find and print the maximum element
        System.out.println(Collections.min(list1)); // Find and print the minimum element
    }
}
