package Task;

public class Task_26_on_31may_Remove_whiteSpace_in_String {
    public static void main(String[] args) {
        String str= " Geeks  for  Geeks ";
        str= str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
