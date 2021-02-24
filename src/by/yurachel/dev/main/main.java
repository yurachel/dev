package by.yurachel.dev.main;

import by.yurachel.dev.entity.Author;
import by.yurachel.dev.entity.Book;
import by.yurachel.dev.entity.Genre;
import by.yurachel.dev.entity.Library;
import by.yurachel.dev.service.Utils;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Library l = new Library();
        Utils util = new Utils();
        Book book1 = new Book("Fire", new ArrayList<>(Arrays.asList(new Author("Abbnet", "D.Y."),
                new Author("Pushkin", "A.S."))), new Genre("Fantastic"), 100, 300);
        Book book2 = new Book("Fly", new ArrayList<>(Arrays.asList(new Author("Her", "Name"))),
                new Genre("Melodrama"), 240, 560);

        l.addBookToLibrary(book1,book2);


//        util.showBooks(util.booksByGenre(l.getLibrary(), "fantastic"));
//        util.showBooks(util.booksByAuthor(l.getLibrary(), "her"));
        System.out.println(util.bookName(l.getLibrary(),"Fly"));

    }
}
