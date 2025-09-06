package Task._14june_Abstract_and_interface;

public class Task44_Interface_with_default_and_Static_method {
    public static void main(String[] args) {
     car c = new car();
     c.start();
     vehicle.fueltype();
    }
}
interface vehicle
{
    default void start()
    {
        System.out.println("Vehicle started");
    }
    static  void fueltype()
    {
        System.out.println("Fuel type is petrol");
    }
}
class car implements  vehicle
{
}