package Iterator;

// 하나하나의 요소 처리를 반복하기 위한 것
// 루프 변수와 같은 역할
public interface Iterator<E> {
    public abstract boolean hasNext();
    public abstract E next();
}
