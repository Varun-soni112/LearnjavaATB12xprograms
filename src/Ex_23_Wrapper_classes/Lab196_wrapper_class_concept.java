package Ex_23_Wrapper_classes;

public class Lab196_wrapper_class_concept {
    /*
    To represent datatype in the form of object to used wrapper classes
         2 ways to create wrapper object :-
      1st by using constructor approach
      2nd by using value of () method.
      ex: Integer i1= Integer.ValueOf(12);
          Integer i2= Integer.ValueOf("56");


         there are 4 utility methods in  wrapper classes
         1st  ValueOf()= convert primitive -->String  to Wrapper object.
         ex: int a=45;
            String s= String.valueOf(a);
            sout(s);

         2nd xxxValue()= convert Wrapper object --> primitive  value.
         ex: Integer i1=Integer.ValueOf(80); // wrap obj.

             wrap -->Primitive
             int i=i1.intValue();
             double d= i1.doubleValue()
             sout(i+d);

         3rd Parsexxx()= convert String --> Primitive value/Wrapper Obj.
          ex: String str1= "36";
              String str2= "4";
             int x=Integer.parseInt(str1);
             Float f=Float.parseInt(Str2);
             sout(x+f);

         4th to String()= Wrapper Obj --> String.

          ex:Interger i1= Integer.ValueOf(50);

           String s1= i1.toString();
           sout(s1);

         Autoboxing and Autounboxing in wrapper obj.

         autoboxing:- without using  two approaches  convert primitive or String --> wrapper obj.
         Interger i= Integer.ValueOf(10); not used.
         Integer i=10; used this.

         Autounboxing:- reverse of autoboxing: convert wrapper to primitive
          not use xxxValue() method.
         int x= new Integer(10);








     */
}
