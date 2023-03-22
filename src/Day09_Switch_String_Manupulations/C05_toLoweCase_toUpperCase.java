package Day09_Switch_String_Manupulations;

import java.util.Locale;

public class C05_toLoweCase_toUpperCase {
    public static void main(String[] args) {



    String kod = "Java Candir Can";
        System.out.println(kod.toLowerCase());//Burda kucuk harflerle yazdir kod'u dedik. Yazdirdiktan sonra bu yeni
        // elde edilen "java candir can"'i kod'a tekrar atamazsak birdahaki sefer kod'u yazdirdigimizda tekrar yukaridaki
        //gibi ilk haliyle yazar "Jave Candir Can".
        //Yapilan degisikligin kalicio olmasi icin degisklikten sonra tekrar kod'a tama yapmaliyiz

        System.out.println(kod); //

        System.out.println(kod.toUpperCase());
        kod=kod.toUpperCase(); // burda buyuk harfe cevirip atama (assignment) yaptik artik buyuk harfle yazacak hep//

        System.out.println(".............");

        System.out.println(kod.toUpperCase());
        System.out.println(kod.toUpperCase(Locale.forLanguageTag("TR"))); // Turkce karakterlerle buyuk harflerle yazdirdik//
        System.out.println(kod.toLowerCase(Locale.forLanguageTag("TR"))); //Turkce karakterlerle kucuk harflerle yazdirdik//





    }
}
