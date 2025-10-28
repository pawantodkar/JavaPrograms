package stad25;

import java.util.HashSet;

public class FirstDuplicateElement
{
    public static void main(String[] args)
    {
        int[] arr = {3, 5, 1, 4, 2, 5, 6, 1};

        HashSet<Integer> set = new HashSet<>();

        // Flag to check if a duplicate is found
        boolean found = false;

        for (int num : arr)
        {
            // If element already exists in the set, it is the first duplicate
            if (set.contains(num))
            {
                System.out.println("First duplicate element: " + num);
                found = true;
                break; // Stop after finding the first duplicate
            }
            else
            {
                set.add(num);
            }
        }

        // If no duplicate found
        if (!found) {
            System.out.println("No duplicate elements found.");
        }
    }
}
