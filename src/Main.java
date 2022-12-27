public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Joanne ", "Rowling");
        Author author2 = new Author("Stephen ", "King;");

        Book hp = new Book("hp", author1, 1997);
        System.out.println(hp.getName());
        System.out.println(hp.author().getAuthorName());
        System.out.println(hp.getYear());

        Book it = new Book("It", author2, 1986);
        System.out.println(it.getName());
        System.out.println(it.author().getAuthorName());
        System.out.println(it.getYear());

        it.setYear(1987);
        System.out.println(it.getYear());

        System.out.println(hp);

        System.out.println(hp.equals(it));
        System.out.println(author1.equals(author2));
    }
}