package Ex_24_Exceptions;

public class Lab207_try_catch_with_finally {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try
        {
            b=a/0;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("I will always executed ");
        }
    }
}
