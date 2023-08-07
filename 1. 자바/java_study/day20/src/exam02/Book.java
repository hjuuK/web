package exam02;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) { // 생성자
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() { // toString 메서드 재정의
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Book) {
            Book book = (Book)obj;
            if (title.equals(book.title) && author.equals(book.author) && publisher.equals(book.publisher)) {
                return true;
            }
        }

        return false;
    }
}
