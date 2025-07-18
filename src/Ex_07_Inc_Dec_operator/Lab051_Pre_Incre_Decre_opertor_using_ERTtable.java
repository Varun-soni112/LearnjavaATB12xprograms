package Ex_07_Inc_Dec_operator;

public class Lab051_Pre_Incre_Decre_opertor_using_ERTtable {
    public static void main(String[] args) {
       /*
           ERT TABLE Expression and relation table.
        */
        int a= 10;
        int b= ++a;
        System.out.println(a);
        System.out.println(b);

        //using ERT TABLE
        /*
        LINE NO  |  A  |  Result b
            8    |10   |  NA
            9    |11   |  11
            10   |11 print | 11
            11   | 11    | 11 print
         */
    }
}
