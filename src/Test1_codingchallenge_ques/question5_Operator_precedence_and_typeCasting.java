package Test1_codingchallenge_ques;

public class question5_Operator_precedence_and_typeCasting {
    //write a program that demonstrate operator Precendence and type casting in java.
//    **Requirement
//   -show operator precendence with complex expression.
//    -Demonstrate implicit and explicit typecasting.
//    -Print result with explanation.
    public static void main(String[] args) {
        //operator precedence
          int a1= 10+5*2;
        System.out.println("result:" +a1); //multiplication first than addition.
          int a2=(3*4)/6;
        System.out.println("result:" + a2); // solve bracket first then divide .

        //Implicit casting:
        int a3=45;
        double d=a3;// directly  int converted into float. or smaller to bigger easily.
        System.out.println(d);//45.0
        //Explicit Casting:  externally  converted bigger into smaller.
        double a4= 46.5;
        int a5=(int)a4; //46



    }
}
