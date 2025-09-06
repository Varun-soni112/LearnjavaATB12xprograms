package Task._25may;
import java.util.Scanner;
public class Task_18_on_25may_fibonacci_series {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int number= s.nextInt();
         int n1 =0;
         int n2 =1;
        System.out.println(n1+" ");
        System.out.println(n2+" ");

         for( int i=3; i<=number; i++)
         {

             int n3= n1+n2;
             n1=n2;
             n2=n3;
             System.out.println(n3+" ");


         }
         

    }
}
