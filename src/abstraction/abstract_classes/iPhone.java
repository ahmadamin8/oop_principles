package abstraction.abstract_classes;

public class iPhone extends Phone{
    public static String OS = "IOS";


    public iPhone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("iPhone calls");

    }

    @Override
    public void ring() {
        System.out.println("iPhone rings");

    }

    @Override
    public void text() {
        System.out.println("iPhone texts");

    }

    @Override
    public boolean isConvertible() {
        return true;
    }
}
