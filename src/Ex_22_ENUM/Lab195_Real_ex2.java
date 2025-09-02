package Ex_22_ENUM;

public class Lab195_Real_ex2 {
    public static void main(String[] args) {

    }
}
enum Locator
{
    page_button("#btn"),page_input("#input1");

    private String locator;

    Locator(String locator)
    {
        this.locator= locator;

    }
    String getLocator()
    {
       return this.locator;
    }
}