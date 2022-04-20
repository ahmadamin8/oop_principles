package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        Samsung s1 = new Samsung("Samsung" , "Black" , 64, 700);
        Nokia n1 = new Nokia("Nokia" , "Blue" , 4 , 100);
        iPhone i1 = new iPhone("Apple" , "Silver" , 128 , 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        for (Phone element : phones) {
            System.out.println(element);
        }

        int count = 0;
        for (Phone element : phones) {
            if(element.isConvertible()) count++;
        }
        System.out.println(count);

        int max = Integer.MIN_VALUE;
        Phone mostExpensive = null;


        for (Phone phone : phones) {
            if (phone.price > max) mostExpensive = phone;
        }

        System.out.println("The most expensive phone is = " + mostExpensive.getClass().getSimpleName());

        System.out.println(iPhone.OS);
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);
        for (Phone phone : phones) {
            phone.call();
            phone.ring();
            phone.text();

        }
    }
}
