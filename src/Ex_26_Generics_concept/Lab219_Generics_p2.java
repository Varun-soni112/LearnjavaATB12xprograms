package Ex_26_Generics_concept;

public class Lab219_Generics_p2 {
    public static void main(String[] args) {
    temp(3,4);
    temp("hello","brother");
    temp(3.24, 5.66);
    }
    static <T> T temp(T a, T b)
    {
        System.out.println(a +""+b);
        return null;
    }
    static <T> T tempsum(T a, T b)
    {
        return null;
    }
}
