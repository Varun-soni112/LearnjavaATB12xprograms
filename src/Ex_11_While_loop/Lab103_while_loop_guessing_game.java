package Ex_11_While_loop;
import java.util.Scanner;
import java.util.Random;
public class Lab103_while_loop_guessing_game {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your guess number");
        int guessnumber;
        int attempt =0;

        Random r= new Random();
        int computerToGuess= r.nextInt(100)+1;

        while(true)
        {
             guessnumber= s.nextInt();
             attempt++;

             if(guessnumber<computerToGuess)
             {
                 System.out.println("To low ,try again");
             }
             else if(guessnumber>computerToGuess)
             {
                 System.out.println("To high , try again");
             }
             else
            {
                System.out.println("your guess is correct"+attempt+ "attempt");
                break;

            }
        }



    }
}
