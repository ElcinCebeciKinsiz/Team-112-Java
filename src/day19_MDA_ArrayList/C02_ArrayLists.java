package day19_MDA_ArrayList;
import day18_Arrays_MDA.C03_AddingElementsByMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C02_ArrayLists {
    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(Arrays.toString(arr));
        /*
        When we create a list we do not need to fix the length
        But we need to add elements one by one
        Arrays can be created by using multidimentional structure but lists can not be created like that
         */
        // to add a new element by using the method
        // we used the method, it retured the new array, to change old array, we need to make assignment

        arr = C03_AddingElementsByMethod.addingNewElement(arr,11);
        System.out.println(Arrays.toString(arr));
        // we have created an empty list
        List<String> letters = new ArrayList<>();
        System.out.println(letters); // []
        letters.add("s");
        letters.add("l");
        letters.add("a");
        System.out.println(letters); // [s, l, a]
    }
}


