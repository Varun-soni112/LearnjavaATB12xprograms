package Ex_20_OOPS_Abstract_and_Intreface._Interface;

public class Lab185_Interface_in_Multiple_inheritance {

}

interface Father
{
    void money();
    void f1();

    default  void fath()
    {
        System.out.println("father default");
    }
}
interface Mother
{
    void money();
    void m1();

    default void fath()
    {
        System.out.println("mother default");
    }
}
class son implements Father, Mother
{ // override only one time  if method is repeat .
    @Override
    public void money() {
        System.out.println("child's money");
    }

    @Override
    public void f1() {
        System.out.println("f1 method");
    }

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void fath() {
        Father.super.fath();//it will call father  function.
        Mother.super. fath();
    }
}