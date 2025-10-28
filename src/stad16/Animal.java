package stad16;

abstract class Animal // parent class
{
    String name;

    Animal(String name)
    {
        this.name = name; // 'this' refers to current variable
    }

    void printName()
    {
        System.out.println("Animal Name: " + this.name); // using 'this' in method
    }
}

class Dog extends Animal // child class
{
    int age;

    Dog()
    {
        this("Bright", 3);
    }

    Dog(String name, int age)
    {
        super(name);
        this.age = age;
    }

    void sound()
    {
        System.out.println(this.name + " says: Woof");
    }

    void display()
    {
        this.printName();
        this.sound();
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.display();
    }
}
