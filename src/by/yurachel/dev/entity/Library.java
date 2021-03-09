package by.yurachel.dev.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private List<Book> library;

    {
        library = new ArrayList<>();
    }

    public List<Book> getLibrary() {
        return library;
    }

    public void setLibrary(List<Book> library) {
        this.library = library;
    }



    public void addBookToLibrary(Book...book) {
        this.library.addAll(Arrays.asList(book));
    }

}
