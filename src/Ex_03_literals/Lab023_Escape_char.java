package Ex_03_literals;

import java.sql.SQLOutput;

public class Lab023_Escape_char {
    public static void main(String[] args) {
        char new_line ='\n';
        char tab_line ='\t';
        char back_space ='\b';
        char carriage_return ='\r';
        System.out.println("varun\nsoni");
        System.out.println("varun"+new_line+"soni");
        System.out.println("varun is best in"+carriage_return+"automation");// carriage return helps to delete the  words written  before carriage return.
    }
}
