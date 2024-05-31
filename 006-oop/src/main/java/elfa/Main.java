package elfa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //    Step 3: Create an object of the class 'Car' and call the method to start it.
//        Car bmw = new Car("BMW", "3er", "black");
//        bmw.starts();
//
//        Car mercedes = new Car("Mercedes", "S", "black");
//        mercedes.starts();
//        mercedes.accelerates(100);

        //    Step 5: Create an instance of the 'Library' class with an array of 'Book' objects. Print the library information to the console.
        Book book1 = new Book("Title 1", "Author 1", "ISBN 1");
        Book book2 = new Book("Title 2", "Author 2", "ISBN 2");
        Book book3 = new Book("Title 3", "Author 3", "ISBN 3");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        Library libraryOfBooks = new Library(books);
        System.out.println(libraryOfBooks);

        libraryOfBooks.addBook(book3);
        System.out.println(libraryOfBooks);

        libraryOfBooks.deleteBook(book1);
        System.out.println(libraryOfBooks);
    }
}