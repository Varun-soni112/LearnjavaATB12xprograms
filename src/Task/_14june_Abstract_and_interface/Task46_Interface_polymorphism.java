package Task._14june_Abstract_and_interface;

public class Task46_Interface_polymorphism {
    public static void main(String[] args) {
        //declare a playable type reference
        Playable instrument;

        // and assign it object of guitar and piano one by one.

         instrument=new Guitar();
         //call play on each
        instrument.play();
         instrument= new piano();
         //call play
         instrument.play();

    }
}
interface Playable
{
    void play();

}
class Guitar implements Playable
{
  public void play()
  {
      System.out.println("playing guitar");
  }
}
class piano implements Playable
{
  public void play()
  {
      System.out.println("playing piano");


  }}