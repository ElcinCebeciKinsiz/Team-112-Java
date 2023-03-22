package Day13_Nested_Loops_Method_Creating;

import java.util.Scanner;

public class C05_Method_Creation {
    public static void main(String[] args) {
        add();
        add();
        add();  // Because we called the method 3 times, it will ask 3 times we run the method//
    }
    public static void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pleae enter a number");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scan.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println(result);
        System.out.println("End of the calculation");
    }
}

