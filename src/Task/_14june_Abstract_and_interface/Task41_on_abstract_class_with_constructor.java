package Task._14june_Abstract_and_interface;

public class Task41_on_abstract_class_with_constructor {
    public static void main(String[] args) {
      student stu = new student();
      stu.m1();

    }
}
abstract  class Teacher
{
    Teacher()
    {
        System.out.println("Abstract class constr");
    }
    abstract void m1();

}
class student extends Teacher
{
    void m1()
    {
        System.out.println("method from abstract class");
    }
}


