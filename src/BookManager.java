import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 * 1. Refactor this class
 * 2. Write JavaDocs
 * 3. Implement getBooksByAuthor method
 */
public class BookManager {

    private Map<String, List<Book>> booksByGenre;

    public BookManager() {
        this.booksByGenre = new HashMap<>();
    }
    public void badAddBook(String title, String author, String genre) {
        if (!booksByGenre.containsKey(genre)) {
            booksByGenre.put(genre, new ArrayList<>());
        }
        Book newBook = new Book(title, author);
        booksByGenre.get(genre).add(newBook);
    }

    public void badRemoveBook(String title, String genre) {
        if (booksByGenre.containsKey(genre)) {
            List<Book> genreBooks = booksByGenre.get(genre);
            for (int i = 0; i < genreBooks.size(); i++) {
                if (genreBooks.get(i).getTitle().equals(title)) {
                    genreBooks.remove(i);
                    break;
                }
            }
        }
    }

    public List<Book> badGetBooksByGenre(String genre) {
        List<Book> result = new ArrayList<>();
        if (booksByGenre.containsKey(genre)) {
            for (Book book : booksByGenre.get(genre)) {
                result.add(book);
            }
        }
        return result;
    }


    // TODO: Implement the getBooksByAuthor method with code completion
    // ...

    // Other methods for future expansion

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}
