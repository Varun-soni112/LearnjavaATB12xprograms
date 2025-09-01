package Ex_17_OOPs;
//calling Attribute and behaviour in main class through object creation
public class Lab144_ATB12xP2main {
    public static void main(String[] args) {
        Lab144_ATB12xP2 atb12xp2= new Lab144_ATB12xP2();

        //calling attributes
        atb12xp2.name="badshah";
        atb12xp2.address="dubai";
        atb12xp2.rollnumber=56;

        //calling behaviour
        atb12xp2.doAssignment();

    }
}
