package Ex_19_OOPs_Part2._1_Inheritance_intro.Multilevel_inheritance;

public class Lab159_MainClassForall_three {
    public static void main(String[] args) {
        Lab158_Grandfather gf= new Lab158_Grandfather();
        Lab158_Father Fath= new Lab158_Father();
        Lab158_Son son = new Lab158_Son();

        System.out.println("---grandfather---");
        gf.BHK1();

        System.out.println("--- father---");
        Fath.Car();
        Fath.Bike();
        Fath.BHK1();

        System.out.println("--- son ---");
         son.gold();
         son.SuperBike();
         son.BHK1();
         son.Bike();
         son.Car();

         /*

         Another concept in  multilevel inheri ie. Dynamic Dispatch
           *from higher to lower.
          Grandfather gf=  new father();
          father f= new son();
          Grandfather gf1= new son();

          son s= new father(); not possible


          */



    }
}
