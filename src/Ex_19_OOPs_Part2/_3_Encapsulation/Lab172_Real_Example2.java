package Ex_19_OOPs_Part2._3_Encapsulation;

public class Lab172_Real_Example2 {
    public static void main(String[] args) {
    ICICIBank Ib = new ICICIBank("garv" ,2300.5);
        System.out.println(Ib.bankname);
        System.out.println(Ib.getName());
        Ib.setName("brother");
        System.out.println(Ib.getName());
        Ib.setBalance(2356.0,true);
        System.out.println(Ib.getBalance());
    }
}

class ICICIBank
{
    private String name;
    private double balance;
    public String bankname;

    public ICICIBank( String name, double balance)
    {
        this.name= name;
        this.balance= balance;
    }

    public String getName()
    {
        return name;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    public void setBalance(double balance, boolean isCashier)
    {
        if(isCashier)
        this.balance=balance;
        else
        {
            System.out.println("not allowed to change the bal");
        }
    }
}
