class Singleton {
    // getInstance()에서 사용되려면 static 이어야 한다.
    private static Singleton s = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return s;
    }

//    static void add() {}

}

abstract class Test {
    abstract void add(int a, int b);
    static void test() {
        return;
    }
}