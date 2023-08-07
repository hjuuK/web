package exam02;

import java.util.HashSet;

public class Ex02 {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book("책1", "저자1", "출판사1"));
        books.add(new Book("책2", "저자2", "출판사2"));
        books.add(new Book("책2", "저자2", "출판사2"));
        books.add(new Book("책3", "저자3", "출판사3"));
        books.add(new Book("책4", "저자4", "출판사4"));

        for(Book book : books) {
            System.out.println(book);
        }  // equals와 hashCode 메서드를 재정의해야 중복이 제거됨
    }
}
