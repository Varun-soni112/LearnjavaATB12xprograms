package Ex_16_Arrays;

public class Lab133_String_Array_part3 {
    public static void main(String[] args) {
        String names[]={"ravi","kishan","tushar"};
        System.out.println(names[0]);//ravi
        System.out.println(names[3]);//Exception.

        String[] names_atb12x= new String[3];
        names_atb12x[0]="aditi";
        names_atb12x[1]="richa";
        names_atb12x[3]="tanya";
        System.out.println(names_atb12x[0]);
        System.out.println(names_atb12x[1]);
    }
}
