package Ex_20_OOPS_Abstract_and_Intreface._Interface;

public class Lab183_Interface_real_example {
    public static void main(String[] args) {
        maruti m= new maruti();
        m.drive();
    }
}

abstract class Engine
{
    abstract void startcar();

    void stopcar()
    {
        System.out.println("stop the car");
    }
}

class maruti extends Engine implements Tyre, Gear
{
    void startcar()
    {
        System.out.println("start the car");
    }

    //used for interface to overrride the abstract methods.
    @Override
    public void polyesterTyre() {

    }

    @Override
    public void rubberTyre() {

    }

    @Override
    public void topGear() {

    }

    @Override
    public void lowestGear() {

    }

    void drive()
    {
        startcar();
        stopcar();
        polyesterTyre();
        rubberTyre();
        topGear();
        lowestGear();
    }

}

interface Tyre
{
    void polyesterTyre();
    void rubberTyre();
}
interface  Gear
{
    void topGear();
    void  lowestGear();
}