package Ex_14_String_class_in_java;

public class Lab115_String_immutable_2 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="disco";
        s1.concat("world");
        s2=s2.concat("dancer");
        System.out.println(s1);//without assingned  hello will be print
        System.out.println(s2);//with assigned discodancer will be print.
         // in SCP contain 4 String.ie hello, helloworld ,disco , discodancer.
    }
}
