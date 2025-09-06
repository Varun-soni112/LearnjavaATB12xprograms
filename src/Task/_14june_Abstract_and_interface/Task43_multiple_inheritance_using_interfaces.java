package Task._14june_Abstract_and_interface;

public class Task43_multiple_inheritance_using_interfaces {
    public static void main(String[] args) {
     Document d= new Document();
     d.print();
     d.show();
    }
}
interface printable
{
   void print();
}
interface showable
{
   void show();
}
class Document implements printable,showable
{
 public void print()
 {
     System.out.println("printing Document");
 }
 public void show()
 {
     System.out.println("Showing Document");

 }}