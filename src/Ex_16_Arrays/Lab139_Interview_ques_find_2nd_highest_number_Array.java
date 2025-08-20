package Ex_16_Arrays;

public class Lab139_Interview_ques_find_2nd_highest_number_Array {
    public static void main(String[] args) {
        int[] num={23,45,56,6,42,51,3,4,5};
        int highest=0;
        int secondhighest=0;

        for(int number:num)
        {
            if(number>highest)
            {
                secondhighest=highest;
                highest=number;

            }
            else if(number>secondhighest && number!=highest)
            {
                secondhighest=number;
            }
        }
        System.out.println(secondhighest);
    }

}
