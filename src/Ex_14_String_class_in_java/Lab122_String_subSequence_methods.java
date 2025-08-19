package Ex_14_String_class_in_java;

public class Lab122_String_subSequence_methods {
    public static void main(String[] args) {
        // .subSequence(start index , end index ):- in subsequence the end index not involved it and return CharSequence.
        CharSequence c= "hello brother".subSequence(2,8);
        System.out.println(c);//llo br


    }
}
