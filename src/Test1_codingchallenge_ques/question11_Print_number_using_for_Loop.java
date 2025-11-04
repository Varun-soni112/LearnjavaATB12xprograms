package Test1_codingchallenge_ques;
import java.util.Scanner;
public class question11_Print_number_using_for_Loop {
    /*
    write a program to print number from 1 to N using a for loop.
           requirement;
    -Read the value of N from user input.
    - Use for loop to print numbers from 1 to N
     -Print number ina single line seperated by space.
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter your number");
        int num= s.nextInt();

        for(int i=1; i<=num; i++)
        {
            System.out.print(i +" ");
        }
        s.close();
    }
}
