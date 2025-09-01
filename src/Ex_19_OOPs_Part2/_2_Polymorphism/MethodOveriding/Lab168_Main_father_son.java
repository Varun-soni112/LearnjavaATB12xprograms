package Ex_19_OOPs_Part2._2_Polymorphism.MethodOveriding;

public class Lab168_Main_father_son {
    public static void main(String[] args) {
//        Lab167_Father fath= new Lab167_Father();
//        Lab167_Son s= new Lab167_Son();
//        fath.car();
//        fath.home();
//        s.bike();
//        s.home();
//        s.car();

        //using concept of dynamic dispatch
        Lab167_Father f= new Lab167_Son();
        f.home();

    }
}
