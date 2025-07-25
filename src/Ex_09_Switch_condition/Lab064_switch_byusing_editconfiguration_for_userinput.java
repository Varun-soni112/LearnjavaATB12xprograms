package Ex_09_Switch_condition;

public class Lab064_switch_byusing_editconfiguration_for_userinput {
    public static void main(String[] args) {
        int days =Integer.parseInt(args[0]);
        switch(days)
        {
            case(1):
                System.out.println("monday");
                break;
            case(2):
                System.out.println("tuesday");
                break;
            case(3):
                System.out.println("wedensday");
                break;
            case(4):
                System.out.println("thursday");
                break;
                case(5):
                System.out.println("friday");
                    break;
                case(6):
                System.out.println("saturday");
                    break;
                case(7):
                System.out.println("sunday");
                    break;
        }
    }

}
