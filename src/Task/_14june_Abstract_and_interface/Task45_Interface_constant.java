package Task._14june_Abstract_and_interface;

public class Task45_Interface_constant {
    public static void main(String[] args) {
        Bike c= new Bike();
        c.constant();
    }
}

interface SpeedLimit
{
    int MAX_SPEED=120;
}
class Bike implements SpeedLimit
{
    public void constant()
    {
        System.out.println("speedlimit is "+SpeedLimit.MAX_SPEED);
    }
}