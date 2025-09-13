package Ex_24_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab210_throws_keyword {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f= new FileReader("abc.txt");
    }
}
