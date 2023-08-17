import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

public class DemoOptional {
    public static void main(String[] args) throws Exception{
        List<Book> books = new ArrayList<>();
        books.add(new Book("John"));
        books.add(new Book("Mary"));
        books.add(new Book("Peter"));

        Optional<Book> book = books.stream()// Object book is not null
                .filter(b -> b.author.startsWith("T"))//
                .findAny();
        // .ifPresent(b -> {
        // System.out.println(b);
        // // codes ...
        // });

        book.ifPresent(b -> {
            System.out.println(b);
            // codes ...
        });


        if (book.isPresent()) {
            System.out.println(book.get());
        } else {
            System.out.println("No Book found");
        }

        Optional<Book> book2 = Optional.of(new Book("Eric"));
        // Optional<Book> book3 = Optional.of(null); //runtime-error
        Optional<Book> book4 = Optional.ofNullable(null);
        System.out.println(book4.isPresent()); // false
        Optional<Book> book5 = Optional.ofNullable(new Book("Jenny"));
        Optional<Book> book6 = Optional.empty();
        System.out.println(book6.isPresent()); // false

        // Optional<Book> book7 = null;
        // System.out.println(book7); // null

        // Optional<Book> -> book
        Book newBook = book6.orElse(new Book("Default"));
        // Optional<Class> is a presentation to represent there would be a null object
        // Optional<Class> is a good choice to be return type
        Book newBook2 = book6.orElse(null); // if book6 is null,
        // book6.orElseGet(e -> newB)   
        Book newBook3 = book6.orElseGet(() -> new Book("default"));
        Book newBook4 = book6.orElseThrow(() -> new Exception());
    }

    public static Optional<Book> getBook() {
        // get book logic
        return Optional.empty();
    }



}
