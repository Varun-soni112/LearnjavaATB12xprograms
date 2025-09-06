package Task._14june_Abstract_and_interface;

public class Task42_abstract_vs_concrete_method {
    public static void main(String[] args) {
    child c= new  child();
    c.show();
    c.display();
    }
}
abstract  class Parent
{
    abstract void show();

    void display()
    {
        System.out.println("concreate method");
    }
}
class child extends Parent
{
    void show()
    {
        System.out.println("implement abstract method");
    }

}