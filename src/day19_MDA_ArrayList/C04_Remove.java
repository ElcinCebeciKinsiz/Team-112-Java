package day19_MDA_ArrayList;
import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("K");
        System.out.println(letters); // [A, B, K]
        System.out.println(letters.remove("B"));  // true
        System.out.println(letters); // [A, K]
        System.out.println(letters.remove(0));  // A
        System.out.println(letters); // [K]
        /*
        If we are working on an Integer List
        when we try use remove pre-made method by entering an int it will be accepted as an index
        If we want to remove the number without checking the index of it
        first we need to create an object of that number ( Integer a = 12;
        then we can directly remove that object from the list
         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(56);
        numbers.add(45);
        System.out.println(numbers);  // [1, 4, 6, 56, 45]
//        numbers.remove(56);
        Integer toRemoveNumber = 56;
        numbers.remove(toRemoveNumber);
        System.out.println(numbers); // [1, 4, 6, 45]
    }
}

