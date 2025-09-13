package Ex_24_Exceptions;

public class Lab209_used_only_exception {
    public static void main(String[] args) {
        try
        {
            String ip= args[0];
            int i= Integer.parseInt(ip);
            int b= 10/i;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
