package Ex_19_OOPs_Part2._2_Polymorphism.MethodOveriding;

public class Lab169_Real_Example {
    public static void main(String[] args) {
        TC_Chrome tc= new TC_Chrome();
        tc.OpenBrowser();
    }

}

class CommonToAllTC
{
    void OpenBrowser()
    {
        System.out.println("opening the browser");

    }
}

class TC_Chrome extends CommonToAllTC
{
    @Override
    void OpenBrowser()
    {
        System.out.println("Starting the chrome");
    }

}