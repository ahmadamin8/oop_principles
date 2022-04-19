package inheritance;

public class VegetableTest {
    public static void main(String[] args) {

        Vegetable vegetable1 = new Vegetable();
        vegetable1.taste = "good";
        vegetable1.name = "parsley";
        vegetable1.isSpicy = false;
        vegetable1.setOrganic(true);
        vegetable1.color = "green";

        System.out.println(vegetable1.name);
        System.out.println(vegetable1.color);
        System.out.println(vegetable1.isOrganic());
        System.out.println(vegetable1);
    }
}
