package Day09_Switch_String_Manupulations;

public class C06_Equals {
    public static void main(String[] args) {
    String str1="Java";
    String str2="JAVA";
    String str3="java";
    String str4="JaVa";


        System.out.println(str1.equals(str2));//False gelir cunku Java ve JAVA ayni degil

        System.out.println(str1.equalsIgnoreCase(str2));// True gelir, Cunku buyuk kucuk harf olmasi onemli degil onemli
                                                        //olan iki str icinde yazan seyin ayni olmasi, nasil yazildigi
                                                        // onemli degil diyoruz equalsIgnoreCase() metodu ile





    }




}
