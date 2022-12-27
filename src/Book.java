import java.util.Objects;

public class Book {
    final private String name;
    final private Author getAuthorName;
    private int year;

    public Book (String name, Author author, int year){
        this.name = name;
        this.getAuthorName = author;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    public Author author(){
        return this.getAuthorName;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && getAuthorName.equals(book.getAuthorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getAuthorName, year);
    }

    public String toString() {
        return this.name + " " + this.getAuthorName + " " + this.year;
    }
}
