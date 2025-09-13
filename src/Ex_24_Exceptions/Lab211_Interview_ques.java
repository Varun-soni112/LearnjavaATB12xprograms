package Ex_24_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab211_Interview_ques {
    public static void main(String[] args) {
        try
        {
            FileInputStream fs= new FileInputStream("abc.txt");
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("yes");
        }
    }
}
