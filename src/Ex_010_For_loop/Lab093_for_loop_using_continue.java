package Ex_010_For_loop;

public class Lab093_for_loop_using_continue {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++)
        {
            if(i==5)
            {
                continue;// continue mean to skipping that values
            }
            System.out.println(i);
        }
    }
}
