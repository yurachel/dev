package by.yurachel.dev.service;

import by.yurachel.dev.entity.Author;
import by.yurachel.dev.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public void showBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void sortByPrice(List<Book> library, String sortOrder) throws Exception {
        if (sortOrder.equalsIgnoreCase("Ascending")) {
            library.sort((book1, book2) -> book1.getPrice() - book2.getPrice());
        } else if (sortOrder.equalsIgnoreCase("Descending")) {
            library.sort((book1, book2) -> book2.getPrice() - book1.getPrice());
        } else {
            throw new Exception("Wrong order");
        }
    }

    // Книги определенного жанра.

    public List<Book> booksByGenre(List<Book> library, String genre) {
        List<Book> booksList = new ArrayList<>();
        for (Book book : library) {
            if (genre.equalsIgnoreCase(book.getGenre().getGenre())) {
                booksList.add(book);
            }
        }
        return booksList;
    }

    // Книги определенного автора

    public List<Book> booksByAuthor(List<Book> library, String authorLastName) {
        List<Book> books = new ArrayList<>();
        for (Book book : library) {
            for (Author authors : book.getAuthors()) {
                if (authorLastName.equalsIgnoreCase(authors.getLastName())) {
                    books.add(book);
                }
            }
        }
        return books;
    }

    // Ищет книгу по названию.

    public Book bookName(List<Book> library, String bookName) {
        Book searchingBook = null;
        for (Book book : library) {
            if (bookName.equalsIgnoreCase(book.getBookName())) {
                searchingBook = book;
            }
        }
        return searchingBook;
    }
}
