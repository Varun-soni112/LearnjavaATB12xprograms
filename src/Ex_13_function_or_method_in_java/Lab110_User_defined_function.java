package Ex_13_function_or_method_in_java;

public class Lab110_User_defined_function {

    static void add(int a, int b)
    {
        System.out.println(a+b);
    }

    static int adding(int c, int d)
    {
        return(c+d);
    }

    public static void main(String[] args) {
           add(10,23);

           int a1=adding(11,5);
        System.out.println(a1);


    }
}
