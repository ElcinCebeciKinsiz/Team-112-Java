package day20_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class C09_ChangingPlacingOfListElements {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(33);
    // change places of 6 and 8
        System.out.println(numbers); // [3, 6, 7, 8, 33]
    int tempNumber= numbers.get(3); // saved 8 in a temp int
        numbers.set(3,numbers.get(1)); // 8 will be 6 here
        System.out.println(numbers);  // [3, 6, 7, 6, 33]
        numbers.set(1,tempNumber); // changed value of index 1 with tempNumber 8
        System.out.println(numbers); // [3, 8, 7, 6, 33] // as you can see we changed the values
}
}
