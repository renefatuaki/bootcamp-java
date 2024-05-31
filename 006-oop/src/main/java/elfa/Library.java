package elfa;

import java.util.ArrayList;
import java.util.Arrays;

//    Step 3: Create a class 'Library' with an array of 'Book' objects.
public class Library {
    ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    //    Step 4: Override the toString method of the 'Library' class to display the information of the 'Library' in a readable format.
    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void deleteBook(Book book) {
        this.books.remove(book);
    }
}
