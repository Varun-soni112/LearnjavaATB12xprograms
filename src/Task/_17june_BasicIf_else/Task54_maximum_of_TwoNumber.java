package Task._17june_BasicIf_else;

import java.util.Scanner;

public class Task54_maximum_of_TwoNumber {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("enter number 1");
        int number = s1.nextInt();
        Scanner s2= new Scanner(System.in);
        System.out.println("enter number 2");
        int number2 = s2.nextInt();
        if (number>number2)
        {
            System.out.println("number is max");
        }
        else {
            System.out.println("number2 is max");
        }
    }
}
