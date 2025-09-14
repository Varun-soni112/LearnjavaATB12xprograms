package Task._15june_Wrapperclasses_and_Exception;

import java.util.ArrayList;

public class Task48_WrapperInCollections {
    public static void main(String[] args) {
        //create an Arraylist of Integer
        ArrayList<Integer> list = new ArrayList<>();
        //add primitive int value and convert into Integer.
        list.add(10);
        list.add(15);
        list.add(20);

        //retrieve value from the list(unboxing occur here)
        for(Integer value:list)
        {
            System.out.println(value);

        }    }
}
