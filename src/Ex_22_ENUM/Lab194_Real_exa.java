package Ex_22_ENUM;

public class Lab194_Real_exa {
    public static void main(String[] args) {
        Colors c1 =Colors.BLUE;
        Colors c2= Colors.RED;
        System.out.println(c1.getHexcode());
        System.out.println(c2.getHexcode());
    }
}
enum Colors {
    RED("#FF0000"), GREEN("#61FF33"), BLUE("#3377FF");

// in real example we passing arg in enum variables   and make them private then   calling by constructor and get method
    private String hexcode;

    Colors(String hexcode) {
      this.hexcode= hexcode;
    }

    String getHexcode()
    {
        return this.hexcode;
    }
}
