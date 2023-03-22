package Day08_NestedElse_Ternary_SwitchStatements;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

    // if it is a simple situation we can use ternary. If ... correct ... this  //

       // a=a>0 ? a*2 : a+10 -Burda if condition of a=a>0 met it is a*2 otherwise a+10 yap demek//

        int a=5;
        System.out.println(a=a>0? a*2 :a+10); // Burda  5>0 oldugu icin second condition olan a+10 calisir ve 10 gelir//
                                              // ekrana yazdirinca//


    // Take a number from user
    // If it is an even number print even number, if it is not print odd number

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scan.nextInt();




    }

}
