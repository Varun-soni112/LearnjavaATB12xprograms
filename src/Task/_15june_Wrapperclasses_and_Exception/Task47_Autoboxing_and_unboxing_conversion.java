package Task._15june_Wrapperclasses_and_Exception;

public class Task47_Autoboxing_and_unboxing_conversion {
    public static void main(String[] args) {
        int a =10;
        Integer b= a;//autoboxing getting extra functionality
        System.out.println(b.hashCode());
        System.out.println(b.intValue());
        System.out.println(b.toString());


        //unboxing :reverse of autoboxing.wrapper to primitive.
        Integer c=40;
        int d= c;//in unboxing not getting extra functionality.
        System.out.println(d);// here d. not show any extra functionality.




    }

}
