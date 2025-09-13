package Ex_24_Exceptions;

public class Lab214_Finally_not_executed {
    public static void main(String[] args) throws Exception {
        try
        {
            int a= 10;
            System.out.println(a);
           // System.exit(0);// used to stop the finally  not to executed.
        }
        catch(Exception e)
        {
              throw new RuntimeException(e);
        }
        finally {
            System.out.println("hello last");
        }
    }
    }
