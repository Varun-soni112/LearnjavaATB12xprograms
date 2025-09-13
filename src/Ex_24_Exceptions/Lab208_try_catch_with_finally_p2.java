package Ex_24_Exceptions;

public class Lab208_try_catch_with_finally_p2 {
    public static void main(String[] args) {
        String ip= args[0];
        int a= Integer.parseInt(ip);
        try{
            int b= 10/a;
        } catch (ArithmeticException | NullPointerException| ArrayIndexOutOfBoundsException e ) {
           e.printStackTrace();
        }
        finally {
            System.out.println("it will always executed ");
        }



    }
}
