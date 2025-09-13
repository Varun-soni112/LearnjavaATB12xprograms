package Ex_23_Wrapper_classes;

public class Lab200_wrapper_conversion
{
    public static void main(String[] args) {
        String num= "10";
        int aa =10;

        //string --> Wrapper obj
        Integer i1= Integer.parseInt(num);// parsedouble() ,parsefloat()
                      // or
        //String-->wrapper obj
        Integer i2= Integer.valueOf(num);

        //String --> primitive
        int i= Integer.parseInt(num);

        //Integer a=new Integer(10); not used
        //   or
        Integer a= 10;

    }
}
