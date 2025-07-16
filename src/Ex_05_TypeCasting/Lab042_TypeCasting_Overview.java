package Ex_05_TypeCasting;

public class Lab042_TypeCasting_Overview {
    public static void main(String[] args) {
        /*
        typecasting mean converting a value of one datatype into another datatype
        two types of typecasting:
       1- widening typecasting- done Explicit(which mean do it by yourself) or Implicit (which mean do it automatically ).
       2- Narrowing typecasting- done Explicit , Implicit.
       widening typecasting = also known as implicit casting , occur when converting a small datatype into large one.
       and performed automatically and no risk of data loss.
       Narrowing typecasting occur when converting a large datatype into small one.  implicitly it is not possible.
         */
        byte b= 34;
        int a= b;// widening implicit typecasting done automatically.
        int a1=(int)b; // widening Explicit typecasting done by yourself. it is optional ..

    }
}
