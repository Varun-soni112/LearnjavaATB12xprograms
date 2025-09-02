package Ex_21_Static_keyword;

public class Lab190_real_ex {
    public static void main(String[] args) {
      ATB12x X=new ATB12x("varun","654865264");
        System.out.println(X.getPhone());
        System.out.println(X.getName());
        ATB12x.doAssignment();
        X.readDocument();

    }
}
 class ATB12x
 {
    {
        System.out.println("instance block");//instance block
    }
    static
    {
        System.out.println("load the class , i will executed.");
    }

     private  String name;
     private  String phone;

     ATB12x(String name, String phone)
     {
         this.name=name;
         this.phone=phone;
     }

     public String coursename= "ATBx";

     public String getName() {
         return name;
     }
     public void setName(String name)
     {
         this.name= name;
     }

     public String getPhone() {
         return phone;
     }

     public void setPhone(String phone) {
         this.phone = phone;
     }
     void readDocument()
     {
         System.out.println(coursename);
     }
     static void doAssignment()
     {
         System.out.println("do Assignment");
     }
 }
