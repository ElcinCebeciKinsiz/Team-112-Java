package day19_MDA_ArrayList;
import java.util.ArrayList;
import java.util.List;

public class C03_add {
    /*
    Lists do not accept primitive data types
    we should use non-primitive data types
     */
    public static void main(String[] args) {
        // Integer is a wrapperclass of int primitive data type
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        System.out.println(numbers); // [3, 5, 2]
        numbers.add(1,7);
        System.out.println(numbers); // [3, 7, 5, 2]
        List<Integer> addOn = new ArrayList<>();
        addOn.add(45);
        addOn.add(67);
        System.out.println(addOn); // [45, 67]
        numbers.addAll(addOn);
        System.out.println(numbers);  // [3, 7, 5, 2, 45, 67]
        numbers.addAll(2,addOn);
        System.out.println(numbers); // [3, 7, 45, 67, 5, 2, 45, 67]
        numbers.addAll(0,addOn);
        System.out.println(numbers); // [45, 67, 3, 7, 45, 67, 5, 2, 45, 67]
    }
}

