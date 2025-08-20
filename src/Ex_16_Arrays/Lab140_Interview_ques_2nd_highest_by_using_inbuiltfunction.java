package Ex_16_Arrays;

import java.util.Arrays;

public class Lab140_Interview_ques_2nd_highest_by_using_inbuiltfunction {
    public static void main(String[] args) {
        int[] numbers={23,56,89,65,32,45,68};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
