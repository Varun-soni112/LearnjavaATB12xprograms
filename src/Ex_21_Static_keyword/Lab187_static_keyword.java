package Ex_21_Static_keyword;

public class Lab187_static_keyword {
    public static void main(String[] args) {
      Student s1= new Student(56);
        System.out.println(s1.rollno);
        Student.m1(); //static can be access by classname.
        System.out.println(Student.course_name);
    }
}
class Student
{
    int rollno; //instance var

    static String course_name="ATB";// Static var

    Student(int rollno) //cons
    {
        this.rollno=rollno;
    }

    static void m1() //static method
    {
        System.out.println("Static method");
    }
}