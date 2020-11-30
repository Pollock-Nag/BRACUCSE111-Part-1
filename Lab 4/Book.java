public class Book{
  String title;
  String author;
  double price;
  String temp;
  public void setTitle(String title){
    this.title=title;
  }
  public void setAuthor(String author){
    this.author=author;
  }
  public void setPrice(double price){
    this.price=price;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public String print(){
    temp=("Title :" +title+" Author :"+author);
    return temp;
  }
}