package Ex_14_String_class_in_java;

public class Lab123_String_subString_method {
    public static void main(String[] args) {
        //substring method is used to remove that string that you mentioned in terms of index suppose index is 2 it mean remove 2 char from starting.
        //substring return  String.

        String s="Disco".substring(2);
        System.out.println(s);

        String s1="Disco".substring(2,4);
        System.out.println(s1);

        // string convert into charArray
        char[] arr= "Disco".toCharArray();
        System.out.println(arr);

        //.trim():- used to replace the white space from end points.
        String s2="   Disco   ".trim();
        System.out.println(s2);//"Disco"

        //.isBlank();  is used to check the string is availabel or not.
        boolean b=" ".isBlank();
        System.out.println(b);//true

        //.repeat(int)- it is used to repeat the string inside the no of times in the int
        String s3="bat".repeat(3);
        System.out.println(s3);

        //.equalsIgnoreCase(String):-it is used to compare the string with another string.
        boolean b2="hello".equalsIgnoreCase("HELLO");
        System.out.println(b2);//true.

        //.format("%s=%d",String , int)
        String s5=String.format("%s=%d" , "age",45);
        System.out.println(s5);

        //.lines().count(); :- here n is compulsory to  count the  no of lines .
        long count="a\nk\nb\nh".lines().count();
        System.out.println(count);

    }
}
