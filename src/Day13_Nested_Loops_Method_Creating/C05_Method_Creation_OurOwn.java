package Day13_Nested_Loops_Method_Creating;

public class C05_Method_Creation_OurOwn {
    public static void main(String[] args) {
        // create a method that ads two numbers ie 3+5//
        // Bu alan factory gibi. Asagidaki bizim olusturdugumuz adi add olan method ise robotumuz gibi. Yukaridan
        // gonderdigimiz sayilar orda gate den iceri giriyor (3 firstNumbera, 5 second number'a)

        add(3,5); // asagida methodu olusturup buraya add(3,5) yazdik simdi 8 yazdiracak cikyida
        isimEkle("Elcin", "Kinsiz" );

    }
     public static void add(int firsNumber, int secondNumber) {          // this is method we created two add two numbers

      int result=firsNumber+secondNumber;

         System.out.println(result);

    }


    public static void isimEkle(String firstName, String surName) {
        String resultSt= firstName+ surName;
        System.out.println(resultSt);



    }







}
