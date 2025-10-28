package stad16;

public class ThisKeyword
{
    int id;
    String name;

    ThisKeyword(int id, String name)
    {
        this.id = id; // used for id
        this.name = name; // used for name
    }

    void display()
    {
        this.show(); // // 'this' is used to call the current class method show()
    }

    void show() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    ThisKeyword()
    {
        this(1234, "Pawan");  // 'this()' is used to provide input to the constructor with parameters
    }

    public static void main(String[] args)
    {
        ThisKeyword obj = new ThisKeyword();
        obj.display();
    }
}
