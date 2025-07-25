package Ex_08_if_conditions;

public class Lab058_if_condition_by_Editconfiguration {
    public static void main(String[] args) {
      //input from edit configuration
        int age = Integer.parseInt(args[0]);

        if (age>18)
        {
            System.out.println("eligible for vote");
        }
        else
        {
            System.out.println("not eligible for vote");

        }
    }
}
