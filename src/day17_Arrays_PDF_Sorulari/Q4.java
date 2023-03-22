package day17_Arrays_PDF_Sorulari;

public class Q4 {
    public static void main(String[] args) {
        // Verilen iki katli array'de bulunan tum tamsayilarin carpimini bize donduren bir method olusturun//

        int[][] arr = {{5, 7}, {5, 8, 9}, {0, 1}};

        System.out.println(elementleriCarp(arr));

    }

    public static int elementleriCarp(int[][] arr) { // iceride  old icin {0,1} burdaki 0 herseyi sifirladi sonucta

        int carpim = 1; // 0 veremiyoruz cunku carpilinca 0 yapor herseyi

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim *= arr[i][j];
            }
        }
        return carpim;

    }
}
