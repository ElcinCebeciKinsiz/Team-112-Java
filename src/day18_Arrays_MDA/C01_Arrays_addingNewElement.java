package day18_Arrays_MDA;

import java.util.Arrays;

public class C01_Arrays_addingNewElement {
    public static void main(String[] args) {

//        int [] a = {4,5,6};
//        int [] b = {4,5,6,10};
//
//        a = b;
//        System.out.println(Arrays.toString(a));

//      we can not change an array, add or delete any element of an array.
        // but we can assing a new array to old one.


        // let's add a new element to an array

        int[] arr = {4,5,6};
        int addingValue = 10;
        // we are planing to copy old arrays elements then we will add another element so we created an empty space for new element.
        int [] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[newArr.length-1]= addingValue;
        arr = newArr;
        System.out.println(Arrays.toString(arr));


    }
}