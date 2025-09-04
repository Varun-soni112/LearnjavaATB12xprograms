package Task;

public class Task_33_on_12june_single_inheritance {
    public static void main(String[] args) {
     Dog a= new Dog();
     a.sound();
    }
}

class Animal {
    void sound()
    {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Animal not like sound");
    }
}
