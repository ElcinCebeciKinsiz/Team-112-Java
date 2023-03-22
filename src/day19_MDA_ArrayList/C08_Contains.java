package day19_MDA_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class C08_Contains {

    public static void main(String[] args) {
        // If we have a lot of elements to add a list
        // instead of using add command we can create an array by using {}
        // then we can add all these array elements to our list by a loop
        List<Integer> numbers = new ArrayList<>();
        int[] arr = {2,3,5,7,8,6,3,4,5,6,7,8,6,4,3,4,5,6,7,8,7,5,3,4,5,6,7,5,3,4};
        for (int i = 0; i <arr.length ; i++) {
            numbers.add(arr[i] );
        }
        System.out.println("we have added all elements of the array to our list. It is like : "+ numbers);
        System.out.println(numbers.contains(3)); // true
        System.out.println(numbers.contains(9)); // false
        numbers.clear();
        System.out.println("after clear method");
        System.out.println(numbers);
    }
}


