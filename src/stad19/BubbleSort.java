package stad19;

public class BubbleSort
{
    public static void main(String[] args)
    {
        String str = "tzsa"; // input string
        char[] characters = str.toCharArray();

        for (int i = 0; i < characters.length - 1; i++)
        {
            for (int j = 0; j < characters.length - 1 - i; j++)
            {
                String s1 = String.valueOf(characters[j]);
                String s2 = String.valueOf(characters[j + 1]);

                if (s1.compareTo(s2) > 0) // if s1 > s2 swap
                {
                    char temp = characters[j];
                    characters[j] = characters[j + 1];
                    characters[j + 1] = temp;
                }
            }
        }

        String sortedStr = new String(characters);
        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedStr);
    }
}
