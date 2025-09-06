package Task._9june_constructor;

public class Task_31_on_9june_Book_details {
    public static void main(String[] args) {
        book b= new book("rich dad poor dad","louis", 499);
        b.display();
    }
}
class book
{
  String title;
  String author;
  int price;

  book(String title, String author, int price)
  {
      this.title=title;
      this.author=author;
      this.price=price;
  }
    void display()
    {
        System.out.println("book title:-"+title);
        System.out.println("author:-"+author);
        System.out.println("price:-"+price);
    }


}