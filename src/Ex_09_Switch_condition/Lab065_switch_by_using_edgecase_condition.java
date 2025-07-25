package Ex_09_Switch_condition;
import java.util.Scanner;
public class Lab065_switch_by_using_edgecase_condition {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the day");
//        int day=1;
      // int days = s.nextInt();
        if(s.hasNextInt())    //it is that condition of enterning inside the switch  if your input is interger else part
            //is executed

        {
            int day = s.nextInt();
            switch(day) {
                case (1):
                    System.out.println("monday");
                    break;
                case (2):
                    System.out.println("tuesday");
                    break;
                case (3):
                    System.out.println("wedensday");
                    break;
                case (4):
                    System.out.println("thursday");
                    break;
                case (5):
                    System.out.println("friday");
                    break;
                case (6):
                    System.out.println("saturday");
                    break;
                case (7):
                    System.out.println("sunday");
                    break;
                default:
                {
                    System.out.println("plz enter the proper int in the range ");
                }
            }
        }
        else
        {
            System.out.println("why are you entering non integer value");
        }
        s.close();

    }
}
