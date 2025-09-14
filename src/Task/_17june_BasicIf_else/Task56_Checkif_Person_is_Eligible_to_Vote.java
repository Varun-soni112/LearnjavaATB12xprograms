package Task._17june_BasicIf_else;

import java.util.Scanner;

public class Task56_Checkif_Person_is_Eligible_to_Vote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age");

        if (s.hasNextInt())
        {
            int age = s.nextInt();
            if (age >= 18)
            {
                System.out.println("you are eligible to vote");
            } else
            {
                System.out.println("sorry! you aren't eligible");
            }
        }
        else
        {
            System.out.println("enter correct input");
        }
    }
}


