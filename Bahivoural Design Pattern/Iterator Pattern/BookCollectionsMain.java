import java.util.ArrayList;
import java.util.Iterator;

class BookCollections{
    private ArrayList<Book> books= new ArrayList<>();
    public void addBook(Book book)
    {
        books.add(book);
    }
    public ArrayList<Book> getBooks()
    {
        return books;
    }
    public Iterator<Book> createIterator()
    {
        return new BookIterator(books);
    }

    public class BookIterator implements Iterator<Book>
    {
        private ArrayList<Book> books= new ArrayList<>(); 
        int position=0;

        public BookIterator(ArrayList<Book> books)
        {
            this.books= books;
        }

        @Override
        public boolean hasNext() {
            return position<books.size();
        }

        @Override
        public Book next() {
            return books.get(position++);
        }

    }
}
class Book{
    private String content;
    public Book(String c)
    {
        this.content=c;
    }
    public void setContent(String content)
    {
        this.content=content;
    }
    public String getContent()
    {
        return content;
    }
}
public class BookCollectionsMain {
    public static void main(String[] args) {
        BookCollections bc= new BookCollections();
        bc.addBook(new Book("C++"));
        bc.addBook(new Book("Java"));
        bc.addBook(new Book("Py"));

        Iterator<Book> iterator= bc.createIterator();
        while(iterator.hasNext())
        {
            Book book= iterator.next();
            System.out.println(book.getContent());
        }

    }
}
