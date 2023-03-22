package day18_Arrays_MDA;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        // to find a desired element in an array we use binarySearch

            int [] arr = {4,9,1,5,11,3,7,4,6};
            System.out.println(Arrays.binarySearch(arr,5)); // -2
            System.out.println(Arrays.binarySearch(arr,11)); // -4
            System.out.println(Arrays.binarySearch(arr,1)); // -1
            System.out.println(Arrays.binarySearch(arr,7)); // -2
            // If we want to use binarySearch before that we need to sort the array
            Arrays.sort(arr);
            System.out.println("====================");
            System.out.println(Arrays.toString(arr));  // [1, 3, 4, 4, 5, 6, 7, 9, 11]
            System.out.println(Arrays.binarySearch(arr,5)); // 4
            System.out.println(Arrays.binarySearch(arr,11)); // 8
            System.out.println(Arrays.binarySearch(arr,1)); // 0
            System.out.println(Arrays.binarySearch(arr,7)); // 6
            System.out.println(Arrays.binarySearch(arr,4)); // 2
            System.out.println(Arrays.binarySearch(arr,-5)); // -1
            System.out.println(Arrays.binarySearch(arr,-100)); // -1
            System.out.println(Arrays.binarySearch(arr,12)); // -10
            System.out.println(Arrays.binarySearch(arr,200)); // -10
            System.out.println(Arrays.binarySearch(arr,2)); // -2
            // If we try to find an element which is not in the array, result will be negative number. By using this number
            // we can understand where it would be if it was in the array
            // if the desired element is lower then the lowest element of the array, result will be -1
            // If we dont sort the array before using it, the result will give us no info about the value
            // binarySearch returns the index of the element
        }
    }
