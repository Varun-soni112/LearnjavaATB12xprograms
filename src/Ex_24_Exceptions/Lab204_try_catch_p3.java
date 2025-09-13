package Ex_24_Exceptions;

public class Lab204_try_catch_p3 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try
        {
            b=10/a;
        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
       // or  multiple catch. child to parents
        catch(ArithmeticException ae)
        {
            ae.printStackTrace();

        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}
