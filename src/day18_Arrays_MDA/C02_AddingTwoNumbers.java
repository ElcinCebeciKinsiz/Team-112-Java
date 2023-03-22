package day18_Arrays_MDA;

import java.util.Arrays;

public class C02_AddingTwoNumbers {
    public static void main(String[] args) {

        //        int [] a = {4,5,6};
//        int [] b = {4,5,6,10,11};
//
//        a = b;
//        System.out.println(Arrays.toString(a));
//      we can not change an array, add or delete any element of an array.
        // but we can assing a new array to old one.
        // let's add a new element to an array
        int[] arr = {4,5,6};
        int addingValueOne = 10;
        int addingValueTwo = 11;
        // we are planing to copy old arrays elements then we will add another element so we created an empty space for new element.
        int [] newArr = new int[arr.length+2];  // 0 0 0 0 0
        //System.out.println("New Arrays' values : "+Arrays.toString(newArr));
        for (int i = 0; i < arr.length; i++) {  // 4 5 6 0 0
            newArr[i] = arr[i];
        }
        newArr[newArr.length-2]= addingValueOne; // 4 5 6 10 0
        newArr[newArr.length-1]= addingValueTwo; // 4 5 6 10 11
        // new array is ready for the assignment
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }
}















