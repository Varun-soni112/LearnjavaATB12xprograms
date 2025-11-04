package Test1_codingchallenge_ques;
import java.util.Scanner;
public class question9_Day_of_the_Week_usingSwitch_statement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the day");
        int d = s.nextInt();
        switch (d) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("valid  number");
        }
s.close();
    }
}
