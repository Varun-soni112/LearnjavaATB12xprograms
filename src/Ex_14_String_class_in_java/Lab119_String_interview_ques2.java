package Ex_14_String_class_in_java;

public class Lab119_String_interview_ques2 {
    public static void main(String[] args) {
        String s0="fruit";
        String s1="fruit";
        //SCP contain only 1 String ie fruit

        String s3= new String("fruit");
        String s4= new String("Fruit");
        String s5= new String("Fruit");
        //object String contain 3 String



        //== is comparison method  and in case of string its work  to check the ref location.
        System.out.println(s0==s1);// true becoz both  ref are diff but pointing to same fruit.
        System.out.println(s1==s3);// false becoz both are diff strings .
        System.out.println(s3==s4);//false becoz both have diff object area.
        System.out.println(s4==s5);//false becoz both have diff object area.

        //equals method in Strings performe content comparison.
        System.out.println(s0.equals(s1));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s4));//false
        System.out.println(s4.equals(s5));//true

        //equalsIgnoreCase() method in String:it ignore the case and both of them make equals
        System.out.println(s3.equalsIgnoreCase(s4));//true  make it to fruit.

        /*
        equalsIgnoreCase()->FRUIT,FRUit, fruIT, FRuit,=fruit.
        == - check for the ref.
        equals check the  content
         */
    }
}
