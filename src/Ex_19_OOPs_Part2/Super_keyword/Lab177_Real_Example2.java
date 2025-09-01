package Ex_19_OOPs_Part2.Super_keyword;

public class Lab177_Real_Example2 {
    public static void main(String[] args) {
       Son s = new Son();
       s.RealState();
       s.bike();
       s.newhome();
       s.home();
    }
}

class Father
{
//    Father(String name) {
//    }

    void home()
    {
        System.out.println("father's home");
    }
    void RealState()
    {
        System.out.println("father's realstate");
    }

}
class Son extends Father {
    Son() {
//        super("prempal");
    }
        void bike ()
        {
            System.out.println("son bike");
        }
        void newhome ()
        {
            System.out.println("son newhome");
//            super.RealState();
//            super.home();

        }



}
