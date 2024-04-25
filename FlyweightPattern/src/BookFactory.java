import java.util.*;

public class BookFactory {
    private static final Map<String, BookType> bookTypes = new HashMap<String, BookType>();


    public static BookType getBookType(String type, String distributor, String otherData){
        if(bookTypes.get(type) == null){
            bookTypes.put(type, new BookType(type, distributor, otherData));
        }
        return  bookTypes.get(type);
    }

}
