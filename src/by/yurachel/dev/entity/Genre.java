package by.yurachel.dev.entity;

public class Genre {
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Genre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Genre. " + genre;
    }
}
