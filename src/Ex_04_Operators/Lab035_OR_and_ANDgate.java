package Ex_04_Operators;

public class Lab035_OR_and_ANDgate {
    public static void main(String[] args) {
        System.out.println(false || false);//false
        System.out.println(false || true);//true
        System.out.println(true || false);//true
        System.out.println(true || true);//true


        System.out.println(false && false);//false
        System.out.println(false && true);//false
        System.out.println(true && false);//false
        System.out.println(true && true);// true
    }
}
