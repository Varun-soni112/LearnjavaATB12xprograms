package Task;

public class Task_35_on_12june_Hierarchical_inheritance {
    public static void main(String[] args) {
        Car v= new Car();
        bike b= new bike();
        v.soundSystem();
        v.alloywheels();
        b.ppf();b.alloywheels();




    }
}
class Vehical
{
    void alloywheels() {
        System.out.println("fourwheeler");

                    }

}

class Car extends Vehical
{
    void soundSystem()
    {
        System.out.println("best sound");
    }
}

class bike extends Vehical
{
    void ppf()
    {
        System.out.println("new ppf apply ");
    }
}