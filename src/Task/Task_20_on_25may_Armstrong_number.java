package Task;
import java.util.Scanner;
public class Task_20_on_25may_Armstrong_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number to check its a Armstrong no or not");
        int number = s.nextInt();
        int temp1 = number; //declaration when original value not disturb
        int count = 0;

        while (temp1 != 0) {                          // this loop is finding the number of digits in a number and after that increment the count
            temp1 = temp1 / 10;        // count   declare that how many number of digits in a number.
            count++;

        }
        int temp2 = number; //this loop is applying all numbers of digits as power of each digit  and after that sum of all that numbers.
        int sum = 0;

        while (temp2 != 0) {
            int digit;
            int product = 1;
            for (int i = 1; i <= count; i++) {
                digit = temp2 % 10;
                product = product * digit;


            }
            sum = sum + product;
            temp2 = temp2 / 10;

        }
        if (sum == number) {
            System.out.println("yes it is armstrong number");
        } else
        {
            System.out.println("no its not an armstrong number");
        }






    }
}
