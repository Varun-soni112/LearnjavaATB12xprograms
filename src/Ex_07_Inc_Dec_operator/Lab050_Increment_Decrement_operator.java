package Ex_07_Inc_Dec_operator;

public class Lab050_Increment_Decrement_operator {
    public static void main(String[] args) {
        /*
        take input from user using 4 ways

        * by using CLI command line interface.=  use this inside the intellij by click edit configure .inside this  the program
         -argument consider takes the user input and take  "any integer  " as an string only and check the class which you
          want  to run is it selected or not.
         "C:\Users\hp\Desktop\chrome_p5Vpf8lI2l.png"

        * by using Scanner.
        * by using BufferReader class.
        * by using File as input.
         */
        // takes multiple  input from user

        String user_input1 =args[0];// using  args[0th place] to take the user input from edit configuration .user can give  more
        // than one values in args[] and by defautl it is stored in string and after convert it into interger by using Interger.parseInt()methods
        String user_input2= args[1];
        String user_input3= args[2];
        String user_input4= args[3];

       /* int age= Integer.parseInt(user_input); */    // convert it into integer
        System.out.println(user_input1);
        System.out.println(user_input2);
        System.out.println(user_input3);
        System.out.println(user_input4);


        //if you passing less argument -->java.lang.Array index bound exception can be shown

    }
}
