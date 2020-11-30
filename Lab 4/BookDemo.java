public class BookDemo{
  public static void main(String [] args){
    Book b= new Book();
    b.setTitle("Developing Java Software");
    b.setAuthor(" Russel Windersnd");
    b.setPrice( 79.75);
    b.getTitle();
    b.getAuthor();
    b.print();
    System.out.print(b.temp);
  }
}