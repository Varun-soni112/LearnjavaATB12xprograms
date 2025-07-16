package Task;

public class Task_4_Ternary_operator {
    public static void main(String[] args) {
        int num1=9;
        int num2=6;
        int num3=15;
        String largernumber=(num1>num2)?(num1>num3?"num1 is greater":"num3 is greater"):(num2>num3?"num2 is greater":"num 3 is greater");
        System.out.println(largernumber);
    }
}
