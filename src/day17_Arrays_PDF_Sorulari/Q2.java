package day17_Arrays_PDF_Sorulari;

import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};
        //output should be=[5,7,11]

        int shortestIndex=arr.length;

        if(arr[0].length<arr[1].length) {
            shortestIndex=arr[0].length;

        }else {
            shortestIndex=arr[1].length;
        }

        int[] newArray= new int[shortestIndex];


        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=arr[0][i]+arr[1][i];

        }
        System.out.println(Arrays.toString(newArray));
        }

    }
