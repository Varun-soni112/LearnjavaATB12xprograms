package Task;
import java.util.Scanner;
public class Task_11_on_24may_for_loop_using_factorial {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number ");
        int number= s.nextInt();
        int fact =1;
        for(int i=1;i<=number; i++)
        {
           if(number==0)
           {
               fact =1;
           }
            fact = fact *i;
        }
        System.out.println(fact);
//        if(number==0)
//        {
//            fact=1;
//        }

    }
}
