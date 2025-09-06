package Task._31may_String_and_constructor;

public class Task_26_on_31may_Remove_whiteSpace_in_String {
    public static void main(String[] args) {
        String str= " Geeks  for  Geeks ";
        str= str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
