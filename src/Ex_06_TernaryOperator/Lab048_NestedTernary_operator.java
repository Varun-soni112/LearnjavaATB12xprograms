package Ex_06_TernaryOperator;

public class Lab048_NestedTernary_operator {
    public static void main(String[] args) {
        //nested Ternary
        // result = cond1 ? Exp1 hai false stmt : (cond2 ? Exp2 true stmt :Exp3 false stmt);
        int age =19;
//        String result =age>18 ? "you can't go":(age>25) ? "eligible for soft drink": "not eligible for soft drink";
//        System.out.println(result);

        String result1 = (age>18) ?(age>25 ? "eligible for soft drink": "not eligible for soft drink") : "you can't go" ;
        System.out.println(result1);
    }
}
