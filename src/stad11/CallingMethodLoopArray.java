package stad11;

public class CallingMethodLoopArray
{
    public static void main(String[] args)
    {
        LoopUtility.findFactorial(7);

        LoopUtility factNum = new LoopUtility();
        factNum.checkPalindrome(121);

        LoopUtility.reverseNumber(786);

        LoopUtility printTable = new LoopUtility();
        printTable.printTable(12);

        LoopUtility.printFibonacci(10);

        LoopUtility printInverted = new LoopUtility();
        printInverted.printInverted(4);

        LoopUtility.printLeftAligned(4);

        LoopUtility checkPrime = new LoopUtility();
        checkPrime.checkPrime(13);

        LoopUtility.printSquare(4,3);

        int[] arr = {6, 2, 9, 9, 7};
        System.out.println("Before sorting:");
        ArrayUtility.printArray(arr);

        ArrayUtility.bubbleSort(arr);

        System.out.println("After sorting:");
        ArrayUtility.printArray(arr);

        String[] names = {"Shubham", "Akash", "Rahul", "Rohan", "Prakash"};
        String name = "Rahul"; // name to be searched for

        ArrayUtility linearSearch = new ArrayUtility();
        linearSearch.linearSearch(names,name);

        ArrayUtility.findDuplicates(arr);

        ArrayUtility findSecondMaxMin = new ArrayUtility();
        findSecondMaxMin.findSecondMaxMin(arr);

        ArrayUtility.findMaxMin(arr);
    }
}
