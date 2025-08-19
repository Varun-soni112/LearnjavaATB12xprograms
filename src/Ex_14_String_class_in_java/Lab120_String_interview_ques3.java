package Ex_14_String_class_in_java;

public class Lab120_String_interview_ques3 {
    public static void main(String[] args) {
        String str1 = "Fruit";
        String str2 = "Fruit";
        String str3 = new String("Fruit");
        System.out.println(str1==str2);//true becoz diff ref  pointing to same object
        System.out.println(str1==str3);//false  becoz diff object area
        System.out.println(str1.equals(str3));//true becoz content comprison
    }
}
