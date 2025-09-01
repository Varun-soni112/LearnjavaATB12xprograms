package Ex_19_OOPs_Part2.Super_keyword;

public class Lab178_Real_Example3 {
    public static void main(String[] args) {
        Car c = new Car(23);
        c.display();
    }
}

class Vehicle {
    int maxSpeed = 180;

    void noTest() {
        System.out.println("Empty");
    }

    Vehicle() {
        System.out.println("DC cons");
    }

    Vehicle(int a) {
        System.out.println("para cons");
    }

    //method overloading.
    void message() {
        System.out.println("  no Argument");
    }

    void message(int a) {
        System.out.println("one argument");
    }

    void display() {
        System.out.println("parents vehicle");
    }
}

     class Car extends Vehicle
     {
          private int maxSpeed=230;

          Car()
          {
              super();
          }
          Car(int a)
          {
              super(10);
          }
          void Repair()
         {
             System.out.println("new car");
         }
         void display()
         {
             System.out.println("overide parent vehicle");
             System.out.println(super.maxSpeed);
             System.out.println(this.maxSpeed);
             super.noTest();
             this.Repair();




         }

     }


