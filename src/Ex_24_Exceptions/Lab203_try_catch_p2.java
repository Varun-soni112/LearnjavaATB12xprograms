package Ex_24_Exceptions;

public class Lab203_try_catch_p2 {
    public static void main(String[] args) {
        String s1= null;
        try
        {
            s1.trim();
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }
}

