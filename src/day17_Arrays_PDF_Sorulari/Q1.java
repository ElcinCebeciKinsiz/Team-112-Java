package day17_Arrays_PDF_Sorulari;

public class Q1 {
    public static void main(String[] args) {

        int[][] arr={{4,6},{3,5,8},{1,0,4}};
        int flag=0;

        for (int i = 0; i <arr.length ; i++) {             // dis array'in uzunlugr
            for (int j = 0; j < arr[i].length; j++) {       // ic arraydeki her birinin kendi uzunlugu
                if(arr[i][j]%2==0) {
                    flag++;
                }

            }
        }

        System.out.println("Arraydeki cift sayi adedi="+ flag);
        }

}
