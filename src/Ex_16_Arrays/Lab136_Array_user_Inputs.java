package Ex_16_Arrays;
import java.util.Scanner;
public class Lab136_Array_user_Inputs {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size= s.nextInt();

        String[] numbers_marks=new String[size];

        for(int i=0;i< numbers_marks.length; i++)
        {
            System.out.println("Enter the elements:"+i);
            numbers_marks[i]=s.next();//used next() for string Array. if you enter int value it  treat as string

        }
         for(String marks:numbers_marks)
         {
             System.out.println(marks);
         }
         s.close();

    }

}
