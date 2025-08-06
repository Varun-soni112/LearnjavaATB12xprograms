package Task;
import java.util.Scanner;
public class Task_22_on_25may_GradeCalculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter your number and  checking your grade in between A to F");
        int number=s.nextInt();

        switch(number/10)
        {

            case 10,9->System.out.println("Grade A");
            case 8->System.out.println("Grade B");
            case 7->System.out.println("Grade C");
            case 6->System.out.println("Grade D");
            case 5->System.out.println("Grade E");
            default->System.out.println("Grade F");
        }
    }
}
