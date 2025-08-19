package Ex_15_StringBuffer_and_StringBuilder;

public class Lab125_StringBuffer_and_StringBuilder {
    public static void main(String[] args) {
        /*
        String Buffer and String Builder:-both are mutable sequence of character.
        StringBuilder is same as StringBuffer Except one difference
        StringBuffer method are synconized :it is single threaded model. and it is thread safe and slow
        StringBuilder methods are non Synchonized: it is multithreaded model. and it is not thread safe. and fast.

         In real life we use stringbuilder becoz it is faster.
         In Automation we used mostly normal String not Stringbuffer nor stringbuilder
         */

        StringBuffer sb= new StringBuffer("hello");
        StringBuilder sb1= new StringBuilder("durga");

    }
}
