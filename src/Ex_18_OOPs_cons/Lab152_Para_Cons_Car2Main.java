package Ex_18_OOPs_cons;

public class Lab152_Para_Cons_Car2Main {
    public static void main(String[] args) {
        // here in the object  we passing the para cons value.
        Lab152_Para_Cons_Car2 car2= new Lab152_Para_Cons_Car2("fortuner",   "2016" );
        {
            System.out.println(car2.name);
            System.out.println(car2.model);
            System.out.println(car2.year);
        }
    }

}
