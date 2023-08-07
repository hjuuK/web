package exam01;

import java.util.HashSet;

public class Ex02 {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book("책1", "저자1", "출판사1"));
        books.add(new Book("책2", "저자2", "출판사2"));
        books.add(new Book("책2", "저자2", "출판사2"));
        books.add(new Book("책3", "저자3", "출판사3"));
        books.add(new Book("책4", "저자4", "출판사4"));

        for (Book book : books) {
            System.out.println(book);
        }

        // 중복 제거를 위해서 객체의 equals, hashcode를 수정해야 함
        // 재정의하기 전에는 equals, hashcode의 값은 객체의 주소 값이기 때문에 중복돼서 나옴  => Book.java class 참고

    }
}
