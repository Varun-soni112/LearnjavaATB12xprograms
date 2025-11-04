package Ex_26_Generics_concept;

public class Lab220_GenericsClass {
    public static void main(String[] args) {
      GenericsClass gs = new GenericsClass(10);
      GenericsClass gs1 = new GenericsClass("hlo");
      GenericsClass gs3 = new GenericsClass(3.124);

    }
}
class GenericsClass <T>
{
    private T data;

    public GenericsClass(T data)
    {
        this.data = data;
    }
    public T getData()
    {
        return data;
    }
//    public void setData( T data)
//    {
//        this.data=data;
//    }
}
