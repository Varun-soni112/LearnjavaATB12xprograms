package Task._25may;
import java.util.Scanner;
public class Task_19_on_25may_Factorial_program {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your number");
        int number= s.nextInt();
        int fact =1;
        if(number==0)
        {
            fact=1;
        }
        for(int i=1; i<=number; i++)
        {
            fact =fact*i;
        }
        System.out.println(fact);

    }
}
