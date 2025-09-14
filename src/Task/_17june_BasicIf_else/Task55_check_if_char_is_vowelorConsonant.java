package Task._17june_BasicIf_else;

import java.util.Scanner;

public class Task55_check_if_char_is_vowelorConsonant {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the char");
        char ch =s.next().toLowerCase().charAt(0);
        if(!Character.isLetter(ch))
        {
            System.out.println("Invalid input,plz choose the char only");
        }
        else if (ch == 'a'|| ch =='e'|| ch == 'i' || ch =='o' || ch=='u')
        {
            System.out.println("char is vowel");
        }
        else
        {
            System.out.println("char is consonant");
        }
        s.close();
    }
}
