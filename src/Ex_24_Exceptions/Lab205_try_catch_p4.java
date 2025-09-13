package Ex_24_Exceptions;

public class Lab205_try_catch_p4 {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        try
        {
            c= 10/a;
        }
        catch(Throwable th)
        {
             th.getMessage();

        }
        System.out.println(c);
    }
}
