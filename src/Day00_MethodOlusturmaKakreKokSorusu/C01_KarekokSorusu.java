package Day00_MethodOlusturmaKakreKokSorusu;

public class C01_KarekokSorusu {
    public static void main(String[] args) {
        //Ask the user for a number and the power he wants to calculate
        //Create a method that calculates and print

        //Bu kisim robot. Asagiga fabrikada metodu urettik burda metodu call yapiyorus
        power(2,3); // 2 ussu 3 kac diye sorduk cevap 8
        power(5,2);





    }
    public static void power(int number, int pwr) {  //power adinda bir metod olusturduk (Number sayi icin, pwr us icin)
        int result = 1; // 0 yutan eleman old icin 1 yaptik
        int flag = 1;   // Tabani kac kere carpacagini buluyor (power). 0 yutan eleman old icin 1 yaptik.

        while (flag <= pwr) {
            result *= number;
            flag++;
        }
        System.out.println(result);


    }

}


