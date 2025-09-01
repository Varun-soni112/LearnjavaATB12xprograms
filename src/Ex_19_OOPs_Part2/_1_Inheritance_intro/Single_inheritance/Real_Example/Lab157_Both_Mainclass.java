package Ex_19_OOPs_Part2._1_Inheritance_intro.Single_inheritance.Real_Example;

public class Lab157_Both_Mainclass {
    public static void main(String[] args)
    {
        Lab156_TestCase1_Extends  Testcase= new Lab156_TestCase1_Extends();
        {
            Testcase.runningTC1();
            Testcase.closeBrowser();
            Testcase.readDatabaseFile();
            Testcase.startBrowser();
            Testcase.readExcelFile();
        }
    }
}
