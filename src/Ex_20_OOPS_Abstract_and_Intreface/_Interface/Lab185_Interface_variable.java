package Ex_20_OOPS_Abstract_and_Intreface._Interface;

public class Lab185_Interface_variable {
    public static void main(String[] args) {
        varun v= new name();
        v.display();
        System.out.println(v.a);
    }

}
interface varun
{
    int a=56; // variable is by default public static final.
    void display();

}
class  name implements varun
{
    @Override
    public void display() {
        System.out.println(a);//access a easily.
    }
}
