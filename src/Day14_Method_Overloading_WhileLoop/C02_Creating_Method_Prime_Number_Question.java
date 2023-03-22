package Day14_Method_Overloading_WhileLoop;

import java.util.Scanner;

public class C02_Creating_Method_Prime_Number_Question {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alip prime number olup olmadigini kontrol edip yazdirin// //Yazdiran dedigi icin void//

        Scanner scan=new Scanner(System.in);              // Bu section Factory kismi, ilk once robot kismini
        System.out.println(("Lutfen bir sayi giriniz"));  // hazirlaman lazim asagidaki method kisminda

        int number= scan.nextInt();

        isPrimeNumberMethod(number);



    }

    public static void isPrimeNumberMethod(int number) {  // bir sayi 2'ye bolunuyorsa asal degildir. o yuzden 2'den
                                                         // baslayacak ve kendisine kadar olan sayilara kadar bolunuyor
                                                        // mu b
        // una bakacagiz

        int flag=0;

        for (int i = 2; i < number; i++) {  //sayi 2'den baslayip kendinden bir onceki sayiya kadar bakacagiz

            if (number%i==0){ // sayi kendisine bolunebilyorsa fladg'i 1 arttiracagiz ki bilelim hangi sayilar prime degil
                flag++;
            }

        }
        if (flag!=0) {
            System.out.println(number+ " "+ "is not a prime number");
        }else{
            System.out.println(number+ " "+ "is a PRIME Number");
        }

    }

}

