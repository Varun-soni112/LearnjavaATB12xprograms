package Ex_24_Exceptions;

public class Lab201_Exception {
    public static void main(String[] args) {
        System.out.println("Start the progress");
         String st= args[0]; // java.lang.ArrayIndexOutOfBoundException. if nothig provide in the CLI.
         int a = Integer.parseInt(st);// NumberFormatException. if you convert string to lo
         int b= 10/a;// Arithmetic Exception if you provide 0 in the cli option.

        System.out.println(b);
        System.out.println("end the progress");

    }
}
