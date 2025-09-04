package Task;

public class Task_29_on_9june_constructor_program {
    public static void main(String[] args) {
     car c= new car("maruti", 2025,250000);
        System.out.println(c.brand);
        System.out.println(c.model);
        System.out.println(c.price);
    }
}
class car
{
    String brand;
    int model;
    long price;

    car(String brand, int model , long price)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;

    }

}