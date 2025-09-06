package Task._25may;
import java.util.Scanner;
public class Task_16_on_25may_prime_number {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter your number ");
        int number= s.nextInt();
        int count=0;
        if(number<=1)
        {
            //System.out.println("that num isn't prime ");
        }
        else
        {
            for(int i=1;i<=number; i++)
            {
                if(number%i ==0)
                {
                    //System.out.println("your number is prime");
                    count++;
                }
            }


        }
            if(count==2)
            {
                System.out.println("your number is prime");

            }
            else
            {
                System.out.println("your number isn't prime");
            }

            }


    }


