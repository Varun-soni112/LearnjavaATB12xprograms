package Ex_09_Switch_condition;

import java.util.Scanner;

public class Lab066_switch_Interview_question {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the day");//if we enter 3 as input then output will be nothing.
        int day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
        }
    }
}
