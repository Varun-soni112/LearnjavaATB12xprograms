package Test1_codingchallenge_ques;
import java.util.Scanner;
public class question8_Leap_year_Checker {
//    Write a program to check if a given year is a leap year.
//
//  **Requirements:**
//  - A year is leap if it's divisible by 4
//  - Exception: if divisible by 100, it's not leap unless also divisible by 400
//  - Use logical operators in conditions
public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter a year");
    int y=s.nextInt();
    if((y%4==0) && (y%100!=0) || (y%400==0))
    {
        System.out.println("y is leap year.");
    }
    else {
        System.out.println("y is not leap year");

    }
}
}
