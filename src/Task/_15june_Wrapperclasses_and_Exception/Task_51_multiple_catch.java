package Task._15june_Wrapperclasses_and_Exception;

public class Task_51_multiple_catch {
    public static void main(String[] args) {
        int[]a= {10,20,30};
        int b= 0;
        int c=100;
        try
        {
            int  value=a[5];
            int d= c/b;
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
            ae.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
    }


}
