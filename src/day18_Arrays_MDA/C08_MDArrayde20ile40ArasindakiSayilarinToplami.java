package day18_Arrays_MDA;

public class C08_MDArrayde20ile40ArasindakiSayilarinToplami {
    public static void main(String[] args) {
        // Arreydeki 20 ile 40 arasindaki sayilarin toplamini bulun
        int[][] arr = {{13, 25, 37}, {41, 12, 23, 34}, {11, 25}, {17}};

        int sayiToplam = 0;
        for (int i = 0; i < arr.length; i++) {  // outer array icin//
            for (int j = 0; j < arr[i].length; j++) { //inner arrayleri kontrol edecek
                //    arr[i][j]     tum elementleri elden geciren. SArtik bunu soyuya gore kullanacagiz//
                if (arr[i][j] >= 20 && arr[i][j] <= 40) {
                    sayiToplam += arr[i][j];

                }
            }
        }
        System.out.println(sayiToplam);
//Soru- A. Asagdaki array'in elemanalarinin toplamlarini bul
//      B. 1 ve 3. elemetlerin toplamini yazdir
        int sum = 0;
        int str[] = new int[4];
        str[0] = 10;
        str[1] = 11;
        str[3] = 13;
        for (int i = 0; i < str.length; i++) {
            sum+=str[i];
        }
        System.out.println(sum); //34
        System.out.println(str[1]+str[3]); //24 (11+13)


    }
}


