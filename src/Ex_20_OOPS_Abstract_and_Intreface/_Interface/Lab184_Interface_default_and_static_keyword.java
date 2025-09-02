package Ex_20_OOPS_Abstract_and_Intreface._Interface;

public class Lab184_Interface_default_and_static_keyword {
         //interface contain default and static  method also but after 1.7 version
}

interface  It1
{
    void icm1();
    void icm2();
}
interface It2
{
    void icm3();
}

class Test implements It1,It2
{
    @Override
    public void icm1() {
    }

    @Override
    public void icm2() {
    }

    @Override
    public void icm3() {
    }
}
