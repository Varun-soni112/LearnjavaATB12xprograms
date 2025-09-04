package Task;

public class Task_37_on_12june_method_overriding_in_inheritance {
    public static void main(String[] args) {
     whale w= new whale();
     w.food();
    }
}
class fish
{
    void food()
    {
        System.out.println("fish have food");

    }
}
class whale extends fish
{
    void food()
    {
        System.out.println("whale have eaten there food ");
    }

}

