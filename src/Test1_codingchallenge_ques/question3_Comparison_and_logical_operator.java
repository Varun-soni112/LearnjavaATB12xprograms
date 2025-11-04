package Test1_codingchallenge_ques;

public class question3_Comparison_and_logical_operator {
//    Write a program that demonstrates comparison and logical operators.
//
//      **Requirements:**
//- Use comparison operators (==, !=, <, >, <=, >=)
//- Use logical operators (&&, ||, !)
//- Print boolean results with explanatory messages
    public static void main(String[] args) {
     int a=10;
     int b=5;
     //comparison operartor
        System.out.println("a==b" + (a==b));
        System.out.println("a!=b"+(a!=b));
        System.out.println("a<b"+(a<b));
        System.out.println("a>b"+(a>b));
        System.out.println("a<=b"+(a>=b));
        System.out.println("a>=b"+(a<=b));
     // logical operator
        boolean c = true;
        boolean d= false;
        System.out.println("c&&d" +(c && d));
        System.out.println("c||d"+(c||d));
        System.out.println("!(c==d)" +!(c==d));
     //
    }
}
