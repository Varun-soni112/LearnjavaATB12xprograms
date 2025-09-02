package Ex_21_Static_keyword;

public class Lab189_Static_SIB {
    public static void main(String[] args) {
        A  att= new A();
    }
}

class A
{
    static
    {
        System.out.println("static block1");
        System.out.println("static block2");
    }
    static int a=10;
    static void m1()
    {
        System.out.println("Static method m1");
    }
}
