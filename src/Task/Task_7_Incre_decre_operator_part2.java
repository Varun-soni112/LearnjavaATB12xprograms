package Task;

public class Task_7_Incre_decre_operator_part2 {
    public static void main(String[] args) {
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;  //c=11+22+11+22+13+24  = 103

        System.out.println("a=" + a);//13

        System.out.println("b=" + b);//24

        System.out.println("c=" + c);//103


    }
}
