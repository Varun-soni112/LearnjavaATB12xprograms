package Task._17may_operator;

public class Task_5_TernaryOperator_Part3 {
    public static void main(String[] args) {
        int age =19;
        String categoryOfAge=(age>18)?(age>65?"I am senior":"I am an adult"): "minor";
        System.out.println(categoryOfAge);

    }
}
