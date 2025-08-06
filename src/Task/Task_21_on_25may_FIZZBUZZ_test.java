package Task;
import java.util.Scanner;
public class Task_21_on_25may_FIZZBUZZ_test {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number ");
        int number= s.nextInt();
        if(number>100)
        {
            System.out.println("enter number which is less than 100 or more than 1");
            return;

        }
        for(int i=1;number<=100; number++)
        {
            if (number%3==0&& number%5==0)
            {
                System.out.println("FIZZBUZZ");
            }
            else if(number%3==0)
            {
                System.out.println("FIZZ");
            }
            else if (number%5==0)
            {
                System.out.println("BUZZ");
            }
            else
            {
                System.out.println(i);
            }
        }

    }
}
