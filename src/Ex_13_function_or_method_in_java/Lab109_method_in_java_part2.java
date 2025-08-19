package Ex_13_function_or_method_in_java;

public class Lab109_method_in_java_part2 {
    //step1 declaration of method
    static void non_returntype_func()
    {
        System.out.println("hello ");
    }

    static int returntype_func()
    {
       // System.out.println("varun");
        return 34;
    }

    public static void main(String[] args) {
        // step 2 calling of method
        non_returntype_func();

        int a =returntype_func();
        System.out.println(a);
    }
}
