package Iterator;

// Iterator를 만들기 위한 것
// iterator() 메서드를 사용해 Iterator() 인터페이스를 구현한 클래스의 인스턴스를 하나 만든다.
public interface Iterable<E> {
    public abstract Iterator<E> iterator();
}
