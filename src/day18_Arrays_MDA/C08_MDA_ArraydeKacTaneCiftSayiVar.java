package day18_Arrays_MDA;

public class C08_MDA_ArraydeKacTaneCiftSayiVar {
    public static void main(String[] args) {

        int[][] arr = {{3, 5, 2, 4}, {8, 6, 7, 9, 11}, {10, 4, 1}};

        int flag = 0;
        for (int i = 0; i < arr.length; i++) {  // bu outer array'i kontrol eder
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    flag++;
                    System.out.print( arr[i][j] +"-");  // 2,4,8,6,10,4
                }
            }
        }
        System.out.println();
            System.out.println("Cift Sayi Adedi="+ flag);   // 6 (Toplam 6 adet cift sayi var)


        }
    }



