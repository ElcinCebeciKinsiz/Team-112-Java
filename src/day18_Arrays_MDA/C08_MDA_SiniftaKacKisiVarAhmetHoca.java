package day18_Arrays_MDA;

public class C08_MDA_SiniftaKacKisiVarAhmetHoca {
    public static void main(String[] args) {
   String[][] siniflar={{"A","B","D","F"},{"F","P","A"},{"G","Q"}};

   //Q1- D'yi yazdirin//
        System.out.println(siniflar[0][2]); // D

        //Q2- Q'yu Y yapin ve yazdirin//
        siniflar[2][1]="Y";
        System.out.println(siniflar[2][1]); // Y

        //Q3- Ilk sinifin toplam mevcudunu yazdirin//
        System.out.println(siniflar[0].length); // 4

        //Q4- Siniflarda toplam kac kisi oldugunu yazdirin//
         int toplamMevcut=0;
        for (int i = 0; i < siniflar.length ; i++) {
            toplamMevcut += siniflar[i].length;
        }
        System.out.println(toplamMevcut); //9
        System.out.println(".................");

        int[][] arr= {{3,5,7},{1,2,3,4},{1,2},{7}};
        //Q1-Toplam element sayisi kactir?//

        int toplamArr=0;
        for (int i = 0; i <arr.length ; i++) {
            toplamArr+=arr[i].length;
        }
        System.out.println(toplamArr); //10



















        }


    }


