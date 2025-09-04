package Task;

public class Task_32_on_9_june_mobileClass {
    public static void main(String[] args) {
        mobile m = new mobile("samsung", 90000);
       m.display();
    }
}
class mobile
{
    String brand;
    long price;

     //cons overloading.
     mobile(String brand)
    {
        this.brand= brand;
    }
     mobile(String brand,long price)
    {
        this.brand= brand;
        this.price = price;
    }
    void display()
    {
        System.out.println("brand:-"+brand);
        System.out.println("price:-"+price);

    }
}