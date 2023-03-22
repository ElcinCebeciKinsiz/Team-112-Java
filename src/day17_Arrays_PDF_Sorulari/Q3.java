package day17_Arrays_PDF_Sorulari;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
    // Verilen 2 katli bir arreyde her bir ic array'deki elementleri toplayip,
    //yeni olusturacagimiz tek katli bir arrey'e bu toplamlari atayin.

    //input= int[] [] arr={{3,2,1,4},{1,2},{3,4,5},{10}, {2,7}};
    //output=             [10,3,12,10,9]


        int[] [] arr={{3,2,1,4},{1,2},{3,4,5},{10}, {2,7}};
        int [] output=new int[arr.length];
        int totalOfInnerArr=0;

                for(int i=0; i<arr.length;i++) {       //outer array icindeki array'leri kontrol eder

                    totalOfInnerArr=0;        //Burayi sifirlamazsan her loop

                    for (int j = 0; j <arr[i].length ; j++) {

                        totalOfInnerArr+=arr[i][j];



                    }

                    output[i]=totalOfInnerArr;
                }

        System.out.println(Arrays.toString(output));

    }
}


