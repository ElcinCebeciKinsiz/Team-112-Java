package day25_passByValue_mutable_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClasses {
    public static void main(String[] args) {

        List<Integer> numbers= new ArrayList<>();
        numbers.add(5);
        numbers.add(9);

        System.out.println(numbers); //[5,9]
        numbers.set(0,7);
        numbers.remove(1);
        System.out.println(numbers); //[7] //Without any assignment, just applying the method s, we change variable
                                           //this means the data type is mutable (thread safe-original value will stay same.
                                           //Banka discount orn gibi. Baslanmgic £18.00, her branch can give 9p discount
                                           //but easch branch will have same start point £18.00
    }
}
