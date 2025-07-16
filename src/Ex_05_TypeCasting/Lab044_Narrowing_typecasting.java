package Ex_05_TypeCasting;

public class Lab044_Narrowing_typecasting {
    public static void main(String[] args) {
        int i= 300;
      //  byte b= i; //narrowing implicit  not possible in this case .jvm to do it. data loss will be there.
        // jvm says you can do an explicit byte ie
        byte b1= (byte)i;//narrowing explicit   done by jvm

        //Narrowing never going to store the full value .
        System.out.println(b1);
    }
}
