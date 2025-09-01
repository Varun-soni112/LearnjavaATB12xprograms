package Ex_19_OOPs_Part2._5_Super_keyword;

public class Lab176_Real_Example {

}

class BaseClass    //parents class
{
    private String browser;  //instance var.

    BaseClass(String browser)
    {
        this.browser= browser;
    }

    public String getBrowser()
    {
        return browser;
    }
    public void setBrowser(String browser, boolean isAdmin)
    {
        if(isAdmin) {
            this.browser = browser;
        }
        else {
            System.out.println("not allowed ");
        }
    }

void openBrowser(String browserName)
    {
        System.out.println("open Browser!:-"+browserName);
    }
    void closeBrowser()
    {
        System.out.println("closeBrowser!:-");
    }

}

class TestCase1 extends BaseClass
{
 TestCase1(String browser)
 {

     super(browser); // access the parent class const.
     super.getBrowser();
     super.setBrowser("chrome",true);
     super.closeBrowser();
     super.openBrowser("chrome");



 }
}