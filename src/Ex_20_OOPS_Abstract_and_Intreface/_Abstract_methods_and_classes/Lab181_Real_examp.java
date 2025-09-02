package Ex_20_OOPS_Abstract_and_Intreface._Abstract_methods_and_classes;

public class Lab181_Real_examp {
    public static void main(String[] args) {
    Swift s = new Swift();
    s.drive();
    }
}


abstract class Engine
{ //declare abstract method
    abstract void startEngine();

     void stopEngine()
     {
         System.out.println("stop the engine");
     }
}

class Swift extends Engine
{ //implement abstract method
    void startEngine()
    {
        System.out.println("Starts the engine");
    }

    void drive()
    {
        startEngine();
        stopEngine();
    }
}
