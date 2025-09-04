package Task;

public class Task_28_on_9june_constructor_Program {
    public static void main(String[] args) {
        new Student("varun",20).display();
    }
}

class Student
{
    String name;
    int age;

    Student( String name, int age)
    {
        this.name= name;
        this.age= age;

    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
    }

}
