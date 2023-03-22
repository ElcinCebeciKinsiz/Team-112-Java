package day17_Arrays_PDF_Sorulari;

import java.util.Arrays;

public class Q3_GROUP {
    public static void main(String[] args) {

        // In a given 2 dimensional array, add the elements in each inner array and assign these sums to a single-layer array that we will create.
        //    input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        ///output: [10, 3, 12, 10, 9]


        int[][] arr = {{3, 1, 2, 4},
                {1, 2},
                {3, 4, 5},
                {10},
                {2, 7}};

        int[] output = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            output[i] = sum;
        }
        System.out.println(Arrays.toString(output));
    }
}


