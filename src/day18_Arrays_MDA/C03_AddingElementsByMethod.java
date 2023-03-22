package day18_Arrays_MDA;

import java.util.Arrays;

public class C03_AddingElementsByMethod {


    // create a method to add an element to an array
    public static void main(String[] args) {
        //        int[] arr = {4,5,6};
        //        int addingValueOne = 10;
        int[] arr = {4,5,6};
        int addingValueOne = 10;
        arr=addingNewElement(arr,addingValueOne);
//        arr=addingNewElement(arr,12);
//        arr=addingNewElement(arr,299);
//        arr=addingNewElement(arr,143);
//        arr=addingNewElement(arr,132);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] addingNewElement (int[] arr, int valueToAdd){
        int[] newArr= new int[arr.length+1]; // 0 0 0 0
        for (int i = 0; i < arr.length ; i++) { // 4 5 6 0
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=valueToAdd;  // 4 5 6 10
        return newArr;
    }
}













