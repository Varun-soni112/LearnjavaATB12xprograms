package Ex_08_if_conditions;
import java.util.Scanner;

public class Lab061_if_else_by_scanner {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("enter your age");
        int age= s.nextInt();

        if(age>20)
        {
            System.out.println("allowed to go goa");

        }
        else
        {
            System.out.println("not allowed to go goa");
        }
        s.close();

    }
}
