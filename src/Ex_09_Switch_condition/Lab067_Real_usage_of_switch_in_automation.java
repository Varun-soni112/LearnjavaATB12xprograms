package Ex_09_Switch_condition;
import java.util.Scanner;
public class Lab067_Real_usage_of_switch_in_automation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the browser name");
       //String browser = s.next();
        //browser = browser.toLowerCase();
        if(s.hasNext()) {

            String browser = s.next();
            browser = browser.toLowerCase();
            switch (browser) {
                case "chrome":
                    System.out.println("welcome in chrome ");
                    System.out.println("T.C...");
                    System.out.println("TC2");
                    break;

                case "edge":
                    System.out.println("improve your experince");
                    break;
                case "firefox":
                    System.out.println("welcome in firefox");
                    break;
                    default:
                    System.out.println("plz enter the correct name of browser");
            }
        }
        else
        {
            System.out.println("yo don't enter the correct name");
        }

        s.close();


        }


    }

