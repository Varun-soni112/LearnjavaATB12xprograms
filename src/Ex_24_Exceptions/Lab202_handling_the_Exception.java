package Ex_24_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab202_handling_the_Exception {
    public static void main(String[] args) {
//        int a= 0;
//        int b= 10;
//        int c= b/a;
//        System.out.println(c); //ArithmeticException.unchecked exception.
        //handle the exception. using try-catch and throws keywords
        /*
         int a =0;
         int b= 10;
         try
         {
             int c=b/a;
         }
         catch (ArithmeticException e)
         {
             e.printStackTrace(); // these are used to print the "exception msg" by using ref var
             //or
             e.getMessage();
             //or
             e.toString();
         }

         */

         //checked exception.
        try
        {
            FileInputStream fls= new FileInputStream("abc.txt");//this is used to read the files
        }
        catch (FileNotFoundException f)
        {
            System.out.println(f.getMessage());
        }
    }
}
