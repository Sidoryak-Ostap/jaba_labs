import java.util.*;

public class Store {

    private static final List<Book> books = new ArrayList<Book>();


    public void storeBook(String name, double price, String type, String distributor, String otherData){
        BookType bookType = BookFactory.getBookType(type, distributor, otherData);
        books.add(new Book(name, price, bookType));
    }

}
