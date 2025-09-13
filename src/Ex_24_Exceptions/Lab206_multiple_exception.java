package Ex_24_Exceptions;

public class Lab206_multiple_exception {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        try{
           b= 10/a; //AE
           String s =null; //Null pointer exception.
           s.trim();
        }
        catch (ArithmeticException e )
        {
            e.printStackTrace();
        }
        catch(NullPointerException npe)
        {
            npe.printStackTrace();
        }
        catch(Exception ecx)
        {
            ecx.printStackTrace();
        }
    }
}
