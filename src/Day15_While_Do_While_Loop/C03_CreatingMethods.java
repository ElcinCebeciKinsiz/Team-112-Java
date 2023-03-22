package Day15_While_Do_While_Loop;

import java.util.Scanner;
public class C03_CreatingMethods {

    public static void sumOfDigitsWhileLoop() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        int sum = 0;
        int remainder = 0;
        // as long as the number is not zero, loop should continue
        while (number != 0) {
            remainder = number % 10; // it will always give the last digit of the number
            sum = sum + remainder;
            number = number / 10;
        }
        System.out.println(sum);
    }
}

















