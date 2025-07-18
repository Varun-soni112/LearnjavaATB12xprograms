package Task;
import java.util.Scanner;
public class Task_9_on_19may_logical_Hacker_rank_problem {
    public static void main(String[] args)
    {
          Scanner s=new Scanner(System.in);
        System.out.println("enter side1 of triangle");
          int side1= s.nextInt();
        System.out.println("enter side2 of triangle");
        int side2= s.nextInt();
        System.out.println("enter side3 of triangle");
        int side3= s.nextInt();

        if((side1==side2) && (side1==side3))
        {
            System.out.println("this is Equilateral triangle");
        }
          else if ((side1 ==side2)||(side2== side3)||(side3 == side1))
        {
            System.out.println("this is isoceles triangle");
        }
          else
        {
            System.out.println("this is scalene Triangle");
        }
          s.close();

    }


}

