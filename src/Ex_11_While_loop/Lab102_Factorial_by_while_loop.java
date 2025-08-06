package Ex_11_While_loop;
import java.util.Scanner;
public class Lab102_Factorial_by_while_loop {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the  number");

        if(!s.hasNextInt()) //it is used for checking the input of user isit interger or not .
        {
            System.out.println("Enter the int values only");
            return;
        }
        int number= s.nextInt();

        int fact=1;
        int i=1;
        if (number==0)
        {
            fact =1;
        }

        while(i<=number)
        {
            fact =fact*i;
            i++;
        }
        System.out.println(fact);


    }
}
