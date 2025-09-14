package Task._15june_Wrapperclasses_and_Exception;

public class Task50_Arithmetic_Exception {
    public static void main(String[] args) {
        int a=0;
        int b= 10;
        try
        {
            int c= b/a;
        }
        catch (ArithmeticException ae)
        {
            ae.getMessage();
        }
    }
}
