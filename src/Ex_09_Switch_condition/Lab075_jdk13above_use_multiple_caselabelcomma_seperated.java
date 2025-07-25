package Ex_09_Switch_condition;

public class Lab075_jdk13above_use_multiple_caselabelcomma_seperated {
    public static void main(String[] args) {

         int number= 10;
         switch(number)
         {
             case 10,23,56,55: //use different case label seperated with commas
                 System.out.println(" print this ");
             case 89,57:
                 System.out.println("use this ");
         }
    }
}
