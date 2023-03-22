package Day08_NestedElse_Ternary_SwitchStatements;

import java.util.Scanner;

public class C05_Ternary_Absolute_Number {
    public static void main(String[] args) {
    // Get a number from user and print its absolute value. Absolute value means pozitif, so if user enters - numbe
    // we have to multipy it with (-1) to make it positive

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scan.nextInt();

        System.out.println(number>=0 ? number : number*(-1));






    }
}
