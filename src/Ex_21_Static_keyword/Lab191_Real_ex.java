package Ex_21_Static_keyword;

public class Lab191_Real_ex {
    public static void main(String[] args) {
      Automation  A= new Automation();
        //System.out.println(A.driver1);
        //System.out.println(Automation.driver1);
        System.out.println(Automation.driver2);
        Automation.driver1="firefox";
        System.out.println(Automation.driver1);
    }
}

class Automation
{
    static String driver1= "chrome";
    static String driver2= "edge";


}

