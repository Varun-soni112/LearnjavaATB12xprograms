package Task;

public class Task_8_Incre_decre_operator_part3 {
    public static void main(String[] args) {

        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;   //1-2-3= -4

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m); //i=0 ,j=1, k=2, m=-4;
    }
}
