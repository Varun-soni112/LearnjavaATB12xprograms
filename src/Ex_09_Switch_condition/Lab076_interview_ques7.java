package Ex_09_Switch_condition;

public class Lab076_interview_ques7 {
    public static void main(String[] args) {
        int i=23;
        switch(41)    //in this switch we write number like 41 but not variable name i so it matches with  one of the case lable and print that.
        {
            default:
                System.out.println("ratan");
            case 56:
                System.out.println("anu");
            case 41:
                System.out.println("varun");
        }
    }
}
