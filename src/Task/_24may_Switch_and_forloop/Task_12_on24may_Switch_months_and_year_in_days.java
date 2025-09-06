package Task._24may_Switch_and_forloop;
import java.util.Scanner;
public class Task_12_on24may_Switch_months_and_year_in_days {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter the  month");
        int month = s1.nextInt();
        System.out.println("Enter the year");
        int year =s2.nextInt();

        switch(month)
        {
            case 1:System.out.println("jan have 31days");
                   break;
            case 2:
                if((year%4==0 && year%100!=0)||(year%400==0))
                {
                    System.out.println("feb have 29 days");
                }
                else
                {
                    System.out.println("feb have 28 days");
                }
                break;

            case 3:
                System.out.println("march have 31 days");
                break;

            case 4:
                System.out.println("april have 30 days");
                break;

            case 5:
                System.out.println("may have 31 days");
                break;

            case 6:
                System.out.println("june have 30 days");
                break;

            case 7:
                System.out.println("july have 31 days");
                break;

            case 8:
                System.out.println("August have 31 days");
                break;

            case 9:
                System.out.println("september have 30 days");
                break;

            case 10:
                System.out.println("october have 31 days");
                break;

            case 11:
                System.out.println("november have 30 days");
                break;

            case 12:
                System.out.println("December have 31 days");
                break;

            default:
                System.out.println("you entered the wrong number");
        }
    }
}
