
class Book {
    private String title;
    private int date_of_publication;

    public Book() {
        title = "unknown";
        date_of_publication = 0;
    }

    public Book(String title) {
        this.title = title;
        date_of_publication = 0;
    }

    public Book(String title, int date_of_publication) {
        this.title = title;
        this.date_of_publication = date_of_publication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate_of_publication(int date_of_publication) {
        this.date_of_publication = date_of_publication;
    }

    public int getDate_of_publication() {
        return date_of_publication;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return this.title+" "+this.date_of_publication;
    }

}

public class TestBook {
    public static void main(String[] args) {
        Book book_1 = new Book();
        Book book_2 = new Book("LOL");
        Book book_3 = new Book("NOT LOL", 1965);
        System.out.println(book_1);
        System.out.println(book_2);
        System.out.println(book_3);
    }
}
