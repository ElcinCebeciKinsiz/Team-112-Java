package Day13_Nested_Loops_Method_Creating;

import java.util.Scanner;

public class C02_Iki_Sayi_Toplama_Methodu_Olusturma {
    public static void main(String[] args) {

        // Kulllanicidan iki sayi alip
        //Toplamlarini yazdirma metodu
        // Once ikinci kisim olan (robot kisminda) methodu olusturup, sonra 1. kisimda (factory kisminda)
        //olusturduguumuz metodu yazip method call yapacagiz. Yoksa bir cikti vermez. 1. kisimda kendi public void
        //methodumuzu olusturuyoruz ilk is, ve kullanicidan istedigimiz bilgileri aliyoruz
        //Burasi 1. Kisim (Factory kismi) ilk } isaretine kadar

   ikiSayiTopla();


    }


    // 2. Kisim-Robot bolumu
    public static void ikiSayiTopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println(("Toplamak uzere iki sayi girin"));
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("Iki Sayinin Toplami=" + (sayi1+sayi2));
    }



    }







