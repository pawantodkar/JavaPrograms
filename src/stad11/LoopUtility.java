package stad11;

public class LoopUtility
{
    public static void findFactorial(int num) // method is camel case and verb
    {
        int factNum = 1; // variable is camel case and describes what the variable holds

        for(int i = 1; i <= num; i++)
        {
            factNum = factNum * i;
        }
        System.out.println("Factorial of " + num + " is: " + factNum);
    }

    public void checkPalindrome(int num) // method is camel case and verb
    {
        int original = num;
        int rev = 0;

        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if(rev == original)
        {
            System.out.println(original + " is a Palindrome number.");
        } else
        {
            System.out.println(original + " is NOT a Palindrome number.");
        }
    }

    public static void reverseNumber(int num) // method is camel case and verb
    {
        int rev = 0;
        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number is: " + rev);
    }

    public void printTable(int num) // method is camel case and verb
    {
        System.out.println("Table of " + num + ":");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void printFibonacci(int endPoint) // method is camel case and verb
    {
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series: " + num1 + " " + num2);

        for (int i = 2; i < endPoint; i++)
        {
            int temp = num1 + num2;
            System.out.print(" " + temp);
            num1 = num2;
            num2 = temp;
        }
    }

    public void printInverted(int rows) // method is camel case and verb
    {
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printLeftAligned(int rows) // method is camel case and verb
    {
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void checkPrime(int inputNum) // method is camel case and verb
    {
        boolean isPrime = true;

        if (inputNum <= 1)
        {
            isPrime = false;
        }
        else
        {
            for (int i = 2; i <= inputNum / 2; i++)
            {
                if (inputNum % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(inputNum + " is a prime number.");
        else
            System.out.println(inputNum + " is not a prime number.");
    }

    public static void printSquare(int rows, int cols) // method is camel case and verb
    {
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= cols; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
