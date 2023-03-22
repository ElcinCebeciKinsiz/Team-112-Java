package day18_Arrays_MDA;

import java.util.Arrays;

public class C01_Arrays_SayilariTerstenYazdirma {
    public static void main(String[] args) {
      int[] arr={3,5,7,9};
        for (int i= 0;i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-(1+i)];
            arr[arr.length-(1+i)] = temp;


        }
        System.out.println(Arrays.toString(arr));


        System.out.println();



     }
}
