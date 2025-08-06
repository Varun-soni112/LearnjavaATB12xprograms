package Task;
import java.util.Scanner;
public class Task_14_on_25_may_count_vowel_and_consonant_in_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String  str= s.next();
        str.toLowerCase();
        int vcount=0;
        int ccount=0;

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vcount++;
            }
            else
            {
                ccount++;
            }
        }
        System.out.println("vcount is "+vcount);
        System.out.println("ccount is" +ccount);


    }


}
