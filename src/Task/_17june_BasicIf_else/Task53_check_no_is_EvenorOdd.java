package Task._17june_BasicIf_else;

import java.util.Scanner;

public class Task53_check_no_is_EvenorOdd {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int number = s.nextInt();
         if(number%2==0)
        {
            System.out.println("num is Even");
        }
        else
        {
            System.out.println("num is odd");
        }
    }
}
