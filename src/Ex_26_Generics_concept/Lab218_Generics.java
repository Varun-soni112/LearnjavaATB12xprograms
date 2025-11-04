package Ex_26_Generics_concept;

public class Lab218_Generics {
    public static void main(String[] args) {
             temp_sum(23,34);
             temp_sum("true","false");

    }

    static  Integer temp_sum(Integer a , Integer b)
    {
        return a+b;
    }
    static String temp_sum(String a, String b)
    {
        return a+b;
    }
}
