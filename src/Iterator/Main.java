package Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("핵심 데이터 모델링"));
        bookShelf.appendBook(new Book("친절한 SQL 튜닝"));
        bookShelf.appendBook(new Book("디자인 패턴 입문"));
        bookShelf.appendBook(new Book("이펙티브 자바"));
        bookShelf.appendBook(new Book("자료구조의 이해"));

        // 명시적으로 iterator 사용
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문 사용
//        for(Book book : bookShelf) {
//            System.out.println(book.getName());
//        }

//        System.out.println();
    }
}
