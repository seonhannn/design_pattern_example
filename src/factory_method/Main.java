package factory_method;

import factory_method.framework.Factory;
import factory_method.framework.Product;
import factory_method.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory(); // 다형성
        Product card1 = factory.create("jiseon");
        Product card2 = factory.create("jiseon2");
        Product card3 = factory.create("jiseon3");
    }
}
