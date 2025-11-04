package Test1_codingchallenge_ques;
import java.util.Scanner;
public class question6_Number_classification {
    //Write a program to check if a number is positive, negative, or zero
    //** Requirement**
    // Read an integer from userr input
    //use if else statement to classify the number.
    //print appropriate message for each case.
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int i = s.nextInt();

        if(i>0)
        {
            System.out.println("i is positive ");
        }
        else if(i==0)
        {
            System.out.println("i is zero");
        }
        else
        {
            System.out.println("i is negative");
        }
    }
}
