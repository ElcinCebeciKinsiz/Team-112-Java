package Day08_NestedElse_Ternary_SwitchStatements;

import java.util.Scanner;

public class C03_NestedIfElseSayiSorusu {
    public static void main(String[] args) {

        /* take a positive number from user
        // if it is an even number, print "even number"
        // if it is not print "odd number"

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int number = scan.nextInt();
        if ( number%2 ==0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        System.out.println(number % 2 ==0 ? "even number" : "odd number ");
    }
}







