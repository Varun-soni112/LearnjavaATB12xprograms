package Ex_07_Inc_Dec_operator;

public class Lab057_Incre_Decre_Advance3 {
    public static void main(String[] args) {
        int a=30;
        int result= --a + a + a++;  //29+29+29=87;
        System.out.println(result);
        System.out.println(a);//30
    }
}
