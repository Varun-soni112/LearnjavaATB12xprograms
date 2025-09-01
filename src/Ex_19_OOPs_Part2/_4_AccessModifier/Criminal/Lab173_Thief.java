package Ex_19_OOPs_Part2._4_AccessModifier.Criminal;

import Ex_19_OOPs_Part2._4_AccessModifier.Police.Lab173_Cop;

public class Lab173_Thief {
    public static void main(String[] args) {
        Lab173_Cop  thief= new Lab173_Cop(10);
        thief.canIShoot();
        System.out.println(thief.gun);
    }
}
