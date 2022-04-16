package encapsulation;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make = "BMW";
        System.out.println(car1.make);

        car1.setYear(2015);
        System.out.println(car1.getYear());

        car1.setPrice(5000 , "abcd1234");
        System.out.println(car1.getPrice());

        System.out.println(car1.getIsConvertible());



    }
}
