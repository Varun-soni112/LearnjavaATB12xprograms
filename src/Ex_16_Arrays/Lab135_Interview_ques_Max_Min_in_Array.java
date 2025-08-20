package Ex_16_Arrays;

public class Lab135_Interview_ques_Max_Min_in_Array {
    public static void main(String[] args) {

        int[] arr={32,56,45,89,45,56,44,75};
        int max_number = max_number_of_element_in_array(arr);
        System.out.println("max is"+max_number);


    }
    static int max_number_of_element_in_array(int[]arr)
    {
        int max=arr[0];
        int i = 0;
        for(int array:arr)
        {
            if(arr[i]>max)
           {
             max=arr[i];
           }
            i++;
        }
        return max;
    }
}
