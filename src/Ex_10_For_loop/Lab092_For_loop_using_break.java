package Ex_10_For_loop;

public class Lab092_For_loop_using_break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);//from 0 to 5 will print
            if(i==5)
            {
                System.out.println(i);// only 5 will print
                break;
            }
            System.out.println(i);// from 0 to 4 is print

        }
    }
}
