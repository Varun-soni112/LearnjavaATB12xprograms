package Ex_18_OOPs_cons;

public class Lab152_Para_Cons_Car2 {
    //ins var

    String name;
    String model;
    int year;

    //default cons
    Lab152_Para_Cons_Car2()
    {
        name="hilux";
        model= "2000";
        year=1998;
    }

    //parameterized cons

    Lab152_Para_Cons_Car2(String name, String model ) //local var

    //convert local to instance var use this keyword.
    {
           this.name=name;
           this.model=model;
    }
}
