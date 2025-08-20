package Ex_16_Arrays;
import java.util.Scanner;
public class Lab137_Reverse_in_Arrays {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=s.nextInt();

        int[] numbers= new int[size];

        for(int i=0; i< numbers.length; i++)
        {
            System.out.println("Enter the numbers:"+i);
            numbers[i]=s.nextInt();

        }
        for(int i= numbers.length-1; i>=0; i--)
        {
            System.out.println(numbers[i]);
        }
    }
}
