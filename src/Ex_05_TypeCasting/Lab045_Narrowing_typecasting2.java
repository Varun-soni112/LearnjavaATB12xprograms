package Ex_05_TypeCasting;

public class Lab045_Narrowing_typecasting2 {
    public static void main(String[] args) {
        long phone_no=985564123;
        //short s=phone_no;    // implicit narrowing it is not possible
        short s= (short)phone_no;// explicit narrowing is possible .
        System.out.println(s);
    }
}
