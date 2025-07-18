package Ex_07_Inc_Dec_operator;

public class Lab052_Post_Inc_Decre_operator_usingERTtable {
    public static void main(String[] args) {
        int a=90;
        System.out.println(++a); //91
        System.out.println(a);  //91

        //post inc - print first and after increse the value
        int a_post = 45;
        int b= a_post++;
        System.out.println(a_post);
        System.out.println(b);

//        ERT TABLE
//          line no | a_post |result b
//             10   | 45      | 45
//             11   | 46      | 45
//             12   | 46 print |NA
//             13   |NA      |45 print
    }
}
