import java.util.Objects;

public class Author {
    final private String name;
    final private String surname;

    public Author (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getAuthorName(){
        return this.name + this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public String toString(){
        return this.name + this.surname;
    }
}
