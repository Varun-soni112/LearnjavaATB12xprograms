package Ex_24_Exceptions;

public class Lab212_without_user_defined_exception {
    public static void main(String[] args) throws InvalidbankException {
       Bank sbi = new Bank("INR",100);
       Bank icici = new Bank("USD",300);
        Integer total_bal =  sbi.add(icici);
        System.out.println(total_bal);
    }
}
class Bank
{
    private  String currency;
    private  Integer account;

    public Bank(String currency, Integer account)
    {
        this.currency= currency;
        this.account= account;
    }
    public String getCurrency()
    {
        return currency;
    }
    public void setCurrency(String currency)
    {
        this.currency= currency;
    }
    public Integer getAccount()
    {
        return account;
    }
    public void setAccount(Integer account)
    {
        this.account=account;
    }
    public Integer add(Bank bankName) throws InvalidbankException {
        if(bankName.currency.equals("INR"))
        {
            return bankName.account + this.account;
        }
        else
        {
            try
            {
                throw new InvalidbankException ("currency mismatch");
            }
            catch (InvalidbankException c)
            {
                 throw new RuntimeException(c);
            }

        }

        }
    }

class InvalidbankException extends  Exception
{
    InvalidbankException(String msg)
    {
        super(msg) ;
    }

}