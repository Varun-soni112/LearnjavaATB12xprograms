package Ex_21_Static_keyword;

public class Lab188_Static_part2 {
    public static void main(String[] args) {
       ATB  atb= new ATB(935684246, "varun");
        System.out.println(atb.phoneno);
        System.out.println(atb.name);
        System.out.println(ATB.coursename);
    }
}
class ATB
{
    int phoneno;
    String name;
    static String coursename="AutomationTesting";

    ATB(int phoneno, String name)
    {
      this.phoneno= phoneno;
      this.name=name;
    }
}
