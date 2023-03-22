package day17_Arrays;

import java.util.Arrays;

public class C01_PrintingArrays {
    public static void main(String[] args) {


        int [] intArr = {3,5,67,8,6,4,3,5,7,9,4};
        // let's print the array
        System.out.println(Arrays.toString(intArr)); // [3, 5, 67, 8, 6, 4, 3, 5, 7, 9, 4]
        // print all the elements of the array
        // to print an element of an array :
        System.out.println(intArr[2]);
        for (int i = 0; i < intArr.length; i++) {  // 3 5 67 8 6 4 3 5 7 9 4
            System.out.print(intArr[i]+" ");
        }
    }
}









