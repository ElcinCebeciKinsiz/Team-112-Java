package day18_Arrays_MDA;

import java.util.Arrays;

public class C06_SplitIleHarfSonElemaniYokEtme {
    public static void main(String[] args) {

        String str = "Java is the characters"; //Split methodunu kullanabilmek icin String'i Array'e ceviriyoruz once
        String[] yeni=str.split("J");    //str'nin elemanalarindan olusan bir array olusturup J'yi yokettik
        System.out.println(Arrays.toString(yeni)); // Yazdirirken Arrays.toString yapmak zorundasin yoksa yazdirmaz Array old icin


        System.out.println("......................");

        String verilenString="Eslem/Ebru/Okul/Esra";
        String[] array= verilenString.split("Ebru");
        System.out.println(Arrays.toString(array));




        System.out.println(Arrays.toString(verilenString.split("Okul")));

        System.out.println(Arrays.toString(verilenString.split("Esra",-1)));


        System.out.println("..................");

        String testString = "Real|How|To|||";
        System.out.println(Arrays.toString(testString.split("\\|", -1)));
        // output : [Real, How, To, , , ]
    }
}









