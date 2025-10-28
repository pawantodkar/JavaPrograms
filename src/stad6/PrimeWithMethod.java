package stad6; // package is lowercase

public class PrimeWithMethod // class is Pascal case
{
    public static void main(String[] args)
    {
        int inputNum = 7; // variable is camel case and describes what the variable holds
        checkPrime(inputNum);
    }

    static void checkPrime(int inputNum) // method is camel case and verb
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
}
