package Task;

public class Task_23_on_31may_Reverse_a_Strings_without_inbuildFunction {
    public static void main(String[] args) {
        String s= "varun";//length() is used
        for(int i=s.length()-1; i>=0;i--)
        {
            System.out.println(s.charAt(i));
        }
    }
}
