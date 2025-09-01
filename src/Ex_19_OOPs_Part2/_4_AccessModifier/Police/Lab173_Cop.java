package Ex_19_OOPs_Part2._4_AccessModifier.Police;

public class Lab173_Cop {
    public int gun;
    String iCard;
//making cons as public and other method also public so easyly can access by other pacakage.
    public Lab173_Cop(int gun)
    {
        this.gun= gun;
    }
  public void canIShoot()
    {
        System.out.println("yes you can shoot!");
    }
}
