package Ex_13_function_or_method_in_java;
import java.util.Scanner;
public class Lab111_making_calculator_using_function {
  //function declaration.

    static int readInt(Scanner s,String str) {
        System.out.print("enter the input numbers");

        if (s.hasNextInt()) {
            return s.nextInt();
        } else {
            System.out.println("enter int value only");
            System.exit(0);
            return-1;

        }

    }

    static int add(int a, int b)
    {
        return a+b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int div(int a, int b) throws ArithmeticException
    {
        if (b==0)
        {
            throw new ArithmeticException("divide by zero is not allowed.");
        }
        return a/b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mod(int a , int b)
    {
        return a%b;
    }



    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        // function calling.

        int a =readInt( s,"enter the input numbers1");
        int b =readInt( s,"enter the input numbers2");

        int result_add=add(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);
        int result_sub=sub(a,b);
        int result_mod=mod(a,b);

        System.out.println(result_add);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_sub);
        System.out.println(result_mod);
    }
}
