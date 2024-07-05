package Iterator;

import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        // 다음 책이 있는지?
        if(index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    public Book next() {
        if(!hasNext()) {
            // 다음 책이 없으면 예외 처리
            throw new NoSuchElementException();
        }
        // 현재 위치의 책 리턴
        Book book = bookShelf.getBookAt(index);
        // 다음 위치의 책 가리키도록
        index++;
        return book;
    }
}
