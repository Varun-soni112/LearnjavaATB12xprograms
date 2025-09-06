package Task._9june_constructor;

public class Task_30_on_9june_Rectangle_area_Using_cons {
    public static void main(String[] args) {
        Rectangle r= new Rectangle(10,3);
        r.display();

    }
}
class Rectangle
{
    int length;
    int breadth;

    Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    void display()
    {
       int area=length*breadth;
        System.out.println("Area of rec:-"+area);
    }

}

