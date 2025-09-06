package Task._14june_Abstract_and_interface;

public class Task39_on_animalsound_Abstract_method {
    public static void main(String[] args) {
    dog d= new dog();
    Cat c= new Cat();
    c.makeSound();
    d.makeSound();
    }
}

abstract class Animal
{
    abstract void makeSound();
}

class dog extends Animal
{
    void makeSound()
    {
        System.out.println("Bark sound");
    }
}

class Cat extends Animal
{
    void makeSound()
    {
        System.out.println("meows sound");
    }
}