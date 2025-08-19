package Ex_15_StringBuffer_and_StringBuilder;

public class Lab129_Interview_question4 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("java");
        sb.append(" programming");
        System.out.println(sb);//java programming
        sb.delete(5,16);
        System.out.println(sb);//java
        sb.replace(0,4,"c++");
        System.out.println(sb);//c++
    }
}
