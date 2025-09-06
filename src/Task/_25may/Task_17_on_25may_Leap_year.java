package Task._25may;
import java.util.Scanner;
public class Task_17_on_25may_Leap_year {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the year");
        int year= s. nextInt();

        if(( year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.println("year is leapyear");

        }
        else
        {
            System.out.println("year isn't leapyear");

        }
    }
}
