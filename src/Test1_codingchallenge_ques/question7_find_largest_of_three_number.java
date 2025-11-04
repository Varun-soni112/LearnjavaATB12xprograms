package Test1_codingchallenge_ques;

import java.util.Scanner;

public class question7_find_largest_of_three_number {
//    Create a program to find the largest among three numbers using if-else statements.
//
//**Requirements:**
//            - Read three integers from user input
//- Use nested if-else or if-else if statements
//- Handle cases where numbers might be equal
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number1");
    System.out.println("Enter the number2");
    System.out.println("Enter the number3");
    int x1=s.nextInt();
    int x2=s.nextInt();
    int x3=s.nextInt();
    if(x1>x2)
    {
        if(x1>x3)
        {
            System.out.println("x1 is largest");
        }
        else
        {
            System.out.println("x3 is largest");
        }
    }
    else
    {
        if(x2>x3)
        {
            System.out.println("x2 is largest");
        }
        else
        {
            System.out.println("x3 is largest");
        }
    }
}
}
