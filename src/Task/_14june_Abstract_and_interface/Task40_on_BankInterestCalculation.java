package Task._14june_Abstract_and_interface;

public class Task40_on_BankInterestCalculation {
    public static void main(String[] args) {
        SBI sbi= new SBI();
        sbi.getInterestRate();
    }
}
abstract class Bank
{
    abstract void getInterestRate();
}
class SBI extends Bank
{
    void getInterestRate()
    {
        System.out.println("its Interest Rate:6.5%");
    }
}
class HDFC extends  Bank
{
    void getInterestRate()
    {
        System.out.println("its Interest rate:7.0%");
    }
}