package Ex_16_Arrays;

public class Lab134_StringArray_traverse_through_for_loop {
    public static void main(String[] args) {

        String[] names={"tanu","ayushi","kapil"};

        for(int i=0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }
//                      or
//------------ for each loop only used in array----
        for(String name: names)
        {
            System.out.println(name);

        }
    }
}
