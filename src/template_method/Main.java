package template_method;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello World.");

        d1.display();
        System.out.println();
        d2.display();
    }
}
