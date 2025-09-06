package Task._25may;
import java.util.Scanner;
public class Task_13_on_25may_Reverse_of_number_using_for_loop {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int number= s.nextInt();
        int rev=0;

        for(; number>0;number =number/10 )
        {
            rev= rev*10+number%10;
            //number=number/10;
        }
        System.out.println("reverse your number" +rev);
    }
}
