package Day08_NestedElse_Ternary_SwitchStatements;

import java.util.Scanner;

public class C01_LeapYearInterviewQuestion {
    public static void main(String[] args) {

        /*Ask the user to enter the year to check if it is a leap year.
        Rule 1: Years not divisible by 4 are not leap  (4 ile bolunen yillar artik yildir demekki)
        Rule 2: Years that are divisible by 4 but not by 100 are leap years.
        Rule 3: Years that are a multiple of 4 but divisible by 100, only years that are a multiple of 400 are leap years
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the year you want to check");
        int year= scan.nextInt();

        if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) { // 100 ve 400'e bolunebilir || 100'e bolunemiyor ama 4'e bolunebiliyorsa artik yil//
            System.out.println("The year you entered is a leap year");//1.ve 2. kurali ilk if de yazdik//
        } else{
            System.out.println(" Not a leap year");
        }

    }



}
