package stad17;

public class FinalNormalCall
{
    public static void main(String[] args)
    {
        FinalClass finalObj = new FinalClass();
        finalObj.display(); // call final class

        NormalClass normalObj = new NormalClass(25);
        normalObj.showDetails(); // call normal class
    }
}
