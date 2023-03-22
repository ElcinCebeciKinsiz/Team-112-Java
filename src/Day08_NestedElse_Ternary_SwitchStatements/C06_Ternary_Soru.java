package Day08_NestedElse_Ternary_SwitchStatements;

import java.util.Scanner;

public class C06_Ternary_Soru {
    public static void main(String[] args) {

        // Take a positive number
        // if it is an even number, print even number
        // if it is not print "odd number"

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        System.out.println(number % 2 == 0 ? "even number" : "odd number ");
        String result = number % 2 == 0 ? "even number" : "odd number ";
    }
}







