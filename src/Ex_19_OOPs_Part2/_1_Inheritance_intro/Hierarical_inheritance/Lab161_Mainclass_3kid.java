package Ex_19_OOPs_Part2._1_Inheritance_intro.Hierarical_inheritance;

public class Lab161_Mainclass_3kid {
    public static void main(String[] args) {
        Lab160_father_kid1 k1= new Lab160_father_kid1();
        Lab160_father_kid2 k2= new Lab160_father_kid2();
        Lab160_father_kid3 k3= new Lab160_father_kid3();

        System.out.println("-kid1-");
        k1.Private_job();
        k1.properties3();

        System.out.println("-kid2-");
        k2.govt_job();
        k2.properties3();

        System.out.println("-kid3-");
        k3.business();
        k3.properties3();

    }

}
