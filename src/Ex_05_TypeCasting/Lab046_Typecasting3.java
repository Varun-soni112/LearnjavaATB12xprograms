package Ex_05_TypeCasting;

public class Lab046_Typecasting3 {
    public static void main(String[] args) {
        int course = 1000;
        float gst = 18.45f;
        //int total = course+gst;//narrowing implicit not possible
        int total =course+(int)gst; // narrowing Explicit is allowed but the float value is not shown becoz course and gst is stored in int.
        System.out.println(total);


        float total1=course+gst;//widening implicit
        //float total1=(float)course+gst; // widening explicit not  recommended.
        System.out.println(total1);

    }
}
