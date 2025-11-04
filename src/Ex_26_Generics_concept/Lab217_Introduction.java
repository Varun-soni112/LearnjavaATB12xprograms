package Ex_26_Generics_concept;

public class Lab217_Introduction {

    /*
    without using generics
    Arraylist is not typesafe  and  error in run time exception and typecasting is mandatory.

     ArrayList list = new ArrayList();
     list.add("hello");  String
     list.add(123);      integer
     list.add(3.14);     float

      String str = (String) list.get(0);   hello
      String integer = (String) list.get(1);
     */



    /*
    with using generics
    Arraylist is type safe and error show in compile time  and not mandatory to typecasting.

     Arraylist<String> list = new Arraylist<>();
     list.add("hello");
     list.add("world");

      String str= list.get(0);
      String str2= list.get(1);

     */

    /*
    genric types allow you to define a class, interface or method with placeholder(type parameters)for the data types
    they will work with.

    generic class:
     class Subject <T>
     {
      private T math;
      private T science;

      public T getMath()
      {
        return math;
      }
      public void setMath( T math)
      {
      this.math= math;
      }
      psvm(String[] args)
      {
      Subject<String> s=new Subject<>();
      s.setMath("rs agarwal");
      String  str =s.getMath();
      }


     }



     */
}

