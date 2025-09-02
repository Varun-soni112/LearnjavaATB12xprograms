package Ex_20_OOPS_Abstract_and_Intreface._Abstract_methods_and_classes;

public class Lab180_Abstract_class {
    public static void main(String[] args) {
   Son s1= new Son();
   s1.loan50k();
    }
}

//decalaration of abstract method.
abstract  class Father
{
    abstract void loan50k();
}

// implementation declare inside the child class.
class Son extends Father
{
    void loan50k()
    {
        System.out.println("father's loan pay by his son");
    }
}