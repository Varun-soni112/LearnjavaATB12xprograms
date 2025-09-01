package Ex_19_OOPs_Part2._3_Encapsulation;

public class Lab171_Real_Example {
    public static void main(String[] args) {
        VWOLogin vwo= new VWOLogin("pramod123","pass123");
        System.out.println(vwo.getUsername());
        vwo.setUsername("john");//update username.
        System.out.println(vwo.getUsername());
    }

}
class VWOLogin {
    private String username;
    private String password;

    // through constructor we can't  print the username   thats why used getter and setter method to print the username
//    and password to  get or to set
    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // that is used to "see" the username.
    public String getUsername()
    {
        return username;
    }
    // that is used to "update" the  username .
    public void setUsername(String username)
    {
        this.username= username;
    }
     //that is used to "see" the password.
    public String getPassword()
    {
        return password;
    }
    //if you only "see" the password then comment it.that is used to update the password.
    public void setPassword(String password,boolean isAdmin)
    {
        //validation
        if(isAdmin)
        {
            this.password= password;
        }
        else
        {
            System.out.println("not allowed ,you aren't admin");
        }

    }
}
