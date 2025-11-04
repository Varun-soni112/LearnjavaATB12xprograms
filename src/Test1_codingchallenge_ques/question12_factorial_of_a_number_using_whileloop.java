package Test1_codingchallenge_ques;
import java.util.Scanner;
public class question12_factorial_of_a_number_using_whileloop {
    /*
    requirement
    read a positive integer from use input.
    use while loop to calculate factorial
     handle edge case for o!=1;
     use appropriate data type to handle large results.

     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter  your number");

        if(!s.hasNextInt())
        {
            System.out.println("plz enter the valid number");
            return;

        }
        int num= s.nextInt();
        int factorial =1;

        if(num<=0)
        {
            System.out.println("factorial of 0 "+factorial);

        }
        int i=1;
        while (i<=num)
        {
            factorial = factorial*i;
            i++;
        }
        System.out.println("fact of num"  +" "+factorial);
    }
}
