package Task;

public class Task_38_on_12june_using_super_keyword {
    public static void main(String[] args) {
        lED led=new lED();
        //led.picturetubetv();
        led.advance_tech();
    }
}
class TV
{
    void picturetubetv()
    {
        System.out.println("old tv");
    }
}
class lED extends TV
{
    void advance_tech()
    {
        super.picturetubetv();
        System.out.println("new tv");
    }
}