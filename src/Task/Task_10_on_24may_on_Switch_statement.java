package Task;
import java.util.Scanner;
public class Task_10_on_24may_on_Switch_statement {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the grade");
       String input  =s.next();
        input =input.toUpperCase();
        char grade =input.charAt(0);
//      String grade = A,B,C,D,E;
         switch (grade)
         {
             case 'A'->System.out.println("excellent");
             case 'B'->System.out.println("good");
             case 'C'->System.out.println("average");
             case 'D'->System.out.println("fail");
             case 'E'->System.out.println("invalid");
         }
          s.close();
    }
}
