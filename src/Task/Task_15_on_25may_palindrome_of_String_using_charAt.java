package Task;
import java.util.Scanner;
public class Task_15_on_25may_palindrome_of_String_using_charAt {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the String");
        String str= s.next();
        str=str.toLowerCase();
        String rev="";


//        for(int i= str.length()-1; i>=0; i--)
//        {
//          rev= rev + str.charAt(i);
//
//        }
        int i= str.length()-1;
        while(i>=0)
        {
            rev =rev +str.charAt(i);
            i--;
        }

        if(str.equals(rev))
        {
            System.out.println("given string is a plaindrome");
        }
        else
        {
            System.out.println("given string isn't palindrome");
        }

    }
}
