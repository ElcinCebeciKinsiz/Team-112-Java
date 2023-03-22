package day19_MDA_ArrayList;
import java.util.ArrayList;
import java.util.List;

public class C06_get_set {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        System.out.println(numbers);  // [3, 5, 2]
        System.out.println(numbers.get(0));  // 3
        // print the last element
        System.out.println(numbers.get(numbers.size()-1)); // 2
        // let's change 5 with 7
        System.out.println(numbers.set(1, 7)); // 5 // set will return the old value
        System.out.println(numbers); // [3, 7, 2]
    }

}
