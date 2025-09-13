package Ex_23_Wrapper_classes;

public class Lab199_Wrapper_Autoboxing_and_unboxing {
    public static void main(String[] args) {
        int a= 23;
        Integer b= a;// boxing : put smaller things into bigger. jvm will do it.
        System.out.println(a);//adding extra functionality.
        System.out.println(b.intValue());


        //unboxing
         Integer aa= 45;
         int bb= aa;//  remove extra functionality
    }
}

