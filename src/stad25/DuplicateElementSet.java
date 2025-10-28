package stad25;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementSet
{
    public static void main(String[] args)
    {
        int[] numbers = {3, 5, 2, 4, 5, 6, 2, 8, 9, 3};

        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int number : numbers)
        {
            if (!uniqueElements.add(number)) // If the number is already in the set, it is a duplicate
            {
                duplicateElements.add(number);
            }
        }

        System.out.println("Duplicate elements are: " + duplicateElements);
    }
}
