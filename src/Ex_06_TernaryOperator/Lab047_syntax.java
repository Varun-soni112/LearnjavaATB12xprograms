package Ex_06_TernaryOperator;

public class Lab047_syntax {
    public static void main(String[] args) {
        // ? :     use that two symbols
        // result = condition ? Expression1  : Expression2;

        int age = 23;
        String CanIGoToGoa = age>18 ? "yes you can go": "you can't go";
        //result            =  cond  ? Exp 1           : Exp2
        System.out.println(CanIGoToGoa);
    }
}
