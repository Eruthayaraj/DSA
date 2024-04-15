package set;
import java.util.HashSet;
import java.util.Objects;
public class HashsetsDemo {
   
    public static void main(String[] args) {
       book b1=new book(1, "java", "james gosling", 15000);
       book b2=new book(1, "java", "james gosling", 15000);
       book b3=new book(2, "java", "james gosling", 15000);
       book b4=new book(3, "java", "james gosling", 15000);
     
    HashSet ss=new HashSet<>();
       ss.add(b4);
       ss.add(b3);
       ss.add(b2);
       ss.add(b1);
       ss.add(10);
       ss.add(20);
       ss.add(10);
       for(Object s:ss){
        System.out.println(s);
       }
    }
    
}
class book{
    int book_id;
    public book(int book_id, String book_name, String book_author, int price) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.price = price;
    }
    @Override
    public String toString() {
        return "book [book_id=" + book_id + ", book_name=" + book_name + ", book_author=" + book_author + ", price="
                + price + "]";
    }
    String book_name;
    String book_author;
    int price;
  
    @Override
public int hashCode() {
    return Objects.hash(book_id, book_name, book_author, price);
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    book other = (book) obj;
    return book_id == other.book_id && Objects.equals(book_name, other.book_name)
            && Objects.equals(book_author, other.book_author) && price == other.price;
}

}
