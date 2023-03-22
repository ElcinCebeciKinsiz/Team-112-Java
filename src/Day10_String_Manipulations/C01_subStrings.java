package Day10_String_Manipulations;

public class C01_subStrings {
    public static void main(String[] args) {

        String str="Java is Beautiful";

        System.out.println(str.substring(str.length()-4));// iful -Son 4 harfi karakteri yazdirma
        System.out.println("................");
        System.out.println(str.substring(8,9));// B- 8. karakteri yazdirmasini istedik (Unutma 0 dan baslaniyor
                                               // karakterleri sayarken ve bosluklarda dahil sayima.

        System.out.println(str.substring(2,3));// v-2. karakteri yazdirdik
        System.out.println(str.substring(0,1));// J-Sifinci karakteri yazdirdik















    }

}
