package Task._17june_BasicIf_else;

import java.util.Scanner;

public class Task52_check_no_ispositive_or_negative {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number");
        int number = s.nextInt();
        if(number>=0)
        {
            System.out.println("number is positive.");
        }
        else {
            System.out.println("number is negative");
        }
    }
}
