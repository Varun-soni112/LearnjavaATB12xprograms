package Ex_15_StringBuffer_and_StringBuilder;

public class Lab124_Conversion_from_String_to_StringBuffer_and_viceversa {
    public static void main(String[] args) {
        // conversion of String to Stringbuffer.
        String s1="varun";
        StringBuffer sb=new StringBuffer(s1);
        System.out.println(sb.reverse());

        // conversion of Stringbuffer to String.
        StringBuffer sb1= new StringBuffer("durga");
        System.out.println(sb1.toString());

    }
}
