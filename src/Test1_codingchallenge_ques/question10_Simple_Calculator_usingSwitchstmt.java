package Test1_codingchallenge_ques;
import java.util.Scanner;
public class question10_Simple_Calculator_usingSwitchstmt {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter num1");
        double num1 = s.nextDouble();

        System.out.println("enter num2");
        double num2= s.nextDouble();

        System.out.println("Enter an operator:(+ ,- ,* ,/)");
        char operator= s.next().charAt(0);
        double result;
        switch (operator)
        {
            case '+':
               result= num1 + num2;
                System.out.println(result);
                break;

            case'-':
                result = num1-num2;
                System.out.println(result);
                break;

            case'*':
                result = num1*num2;
                System.out.println(result);
                break;

            case'/':
                if(num2!=0)
                {
                    result= num1/num2;
                    System.out.println(result);
                }
            else
                {
                    System.out.println("error: divison by zero is not allowed");
                }
            break;


            default:
                System.out.println("invalid operator not allowed ");

        }
        s.close();
    }
}
