class Author {
    private String name;
    private String email;
    private char gender = 'U';

    public Author() {
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Автор - "+ this.name + ", почта - " + this.email+ ", пол - "+ this.gender;
    }
}

public class TestAuthor {
    public static void main(String[] args) {
        Author author_1 = new Author("Gogol","gogol@gmail.com",'m');
        Author author_2 = new Author("Chekhov","chekhov@gmail.com",'m');
        Author author_3 = new Author("Tolstoy","tolostoy@gmail.com",'m');
        System.out.println(author_1);
        System.out.println(author_2);
        System.out.println(author_3);
    }
}
