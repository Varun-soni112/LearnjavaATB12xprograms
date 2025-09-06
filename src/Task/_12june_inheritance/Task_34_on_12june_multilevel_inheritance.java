package Task._12june_inheritance;

public class Task_34_on_12june_multilevel_inheritance {
    public static void main(String[] args) {
       child c= new child();
       c.pension();
       c.gold();
       c.car();
       c.BHK2();
    }
}

class Grandparent {
    void pension() {
        System.out.println("own pension");
    }
}
class parent extends Grandparent {
     void gold()
     {
         System.out.println("1kg gold");
     }
     void car()
     {
         System.out.println("luxury car");
     }
}
class child extends parent
{
    void BHK2 ()
    {
        System.out.println("own house");
    }
}