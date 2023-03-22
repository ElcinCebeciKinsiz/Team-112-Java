package day18_Arrays_MDA;

import java.util.Arrays;

public class C08_MDA_PDF_Sorulari {
    public static void main(String[] args) {
        //Q1- Verilen iki katli bir arrayde bulunan sayilari toplayip sonucu yazdirin
        int[][] arr = {{3, 2, 1}, {10, 2}};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
        }

        System.out.println(toplam);

        //Q2- Q1- Verilen iki katli bir arrayde bulunan cift sayilari toplayip sonucu yazdirin
        //int[][] arr2 = {{3, 2, 1}, {10, 2, 18, 20}};
        //int flag = 0;
        //for (int i = 0; i < arr2.length; i++) {
        //    for (int j = 0; j < arr2[i].length; j++) {
        //        if (arr2[i][j] % 2 == 0) {
        //            flag += arr2[i][j];
        //            flag++;                             // Array icindeki cift sayilari gormek icin. 2-10-2-18-20
        //            System.out.print(arr2[i][j] + "-");  //Array icindeki cift sayilari yazdirmak icin Output=2-10-2-18-20

        //        }
        //    }

        //}
        //System.out.println();
        //System.out.println(flag); //Array icindek cift sayilarin toplamini bulmak icin Output=52

        // Q2-Verilen 2 katli bir arrayde ayni indexe sahip elementleri toplayip, yeni olusturacagimiz tek katli bir
        // array'e bu toplamlari atayin asagida output [5,7,11]olmali


        int[][] arr3 = {{3, 4, 5}, {2, 3, 6, 7}};
        int enKisaArrayLength = arr3[0].length; //En kisa olan array'i baz aliyoruz.Cunku 2. olan dah uzun ama 1'de karsilastiracak
        //eleman kalmiyor. O yuzden icinde daha az eleman olani arr3[0] {3,4,5} olani baz aldik

        for (int i = 0; i < arr3.length; i++) {                      //arr'nin o indexteki indexinin lenghthi enKisaArrayLengt'inden kisa iseUzerinde oldugumuz
            if (arr3[i].length < enKisaArrayLength) {                                             // // o zaman arr[i].lenght'i kabul et
                enKisaArrayLength = arr3[i].length;

            }
        }
        int[] toplamArray = new int[enKisaArrayLength];   //toplamlari koymak icin yeni bir array olusturduk
        int indexdekiElemetlerinToplami = 0;
        for (int i = 0; i < toplamArray.length; i++) {


            for (int j = 0; j < arr3.length; j++) {
                indexdekiElemetlerinToplami += arr3[j][i];
            }
            toplamArray[i] = indexdekiElemetlerinToplami;
            indexdekiElemetlerinToplami = 0;              // bunu toplami sifirlamak icin koyduk her turdan sonra
        }
            System.out.println(Arrays.toString(toplamArray)); // [5,7,11]

        }

    }






