package Ex_14_String_class_in_java;

public class Lab121_String_extra_methods_Example {
    public static void main(String[] args) {

        String s = "aiscount";
        char c = s.charAt(4);//index of 4= o
        System.out.println(c);//o

        // .codePointAt(index of )
        System.out.println(s.codePointAt(0));// it finds the unicode value ie a=67; and A=97;

        // .compareToIgnoreCase(String sr):=it compare two Strings lexographically and return int value.
        int res = "Discount".compareToIgnoreCase("DISCOUNT");
        System.out.println(res);//it return 0 if both strings are matched.

        // .compareTo("String" ):- it return 0 if both String are same  else it return the diff of ASCII value it is
//        either positive or negative also.

        // .index Of("") := it return the index value as an int.
        int i="Flight".indexOf("g");
        System.out.println(i);//3

        //.isEmpty():=it return boolean
        boolean b ="Great".isEmpty();
        System.out.println(b);//false

        //.join("delimeter", "String1" "String2") := delimeter present in between the two strings.
        String str = String.join("5","hello", "Brother" );
        System.out.println(str);//hello5Brother

        //.replace('old char', 'new char');
        String str1="hello".replace('e','o');
        System.out.println(str1);//hollo

        //.startsWith("String"); :=it check  the String starts with correct word or not .
        boolean b1= "java".startsWith("ja");
        System.out.println(b1);//true.
    }
}
