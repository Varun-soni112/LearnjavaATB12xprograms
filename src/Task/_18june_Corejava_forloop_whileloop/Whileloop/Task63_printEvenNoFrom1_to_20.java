package Task._18june_Corejava_forloop_whileloop.Whileloop;

public class Task63_printEvenNoFrom1_to_20 {
    public static void main(String[] args) {
        int num =1;
        while(num<=20)
        {
            if(num%2==0)
            {
                System.out.println(num);
            }
            num++;
        }
    }
}
