package Task._12june_inheritance;

public class Task_36_on_12june_constructor_in_inhertance_program {
    public static void main(String[] args) {
    son c= new son("Retired");
   c.gym();
   c.villa();
    }
}
class Parent
{
    String Army;

    void villa() {
        System.out.println("parent have villa ");
    }
    Parent(String Army)
    {
        System.out.println("parent  are in army");
    }

}
class son extends Parent{


void gym()
{
    System.out.println("child have it own gym");
}
   son(String Army)
  {
    super(Army);
  }
}

