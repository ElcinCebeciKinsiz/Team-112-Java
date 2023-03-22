package Day15_While_Do_While_Loop;

import java.util.Scanner;

public class C02_WhileLoopQ {
    public static void main(String[] args) {

// //Question 1- Let's take a positive integer from the user and find the sum of the digits
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        int sum = 0;
        int remainder=0;
        // as long as the number is not zero, loop should continue
        while (number!=0){
            remainder = number %10; // it will always give the last digit of the number
            sum= sum + remainder  ;
            number = number/10;
        }

        String numberStr= ""+number;  // to make an integer, String is strong, a string we can add nothing to it // to take number of digits
        int loopNumber = numberStr.length();
        for (int i = 1; i <=loopNumber ; i++) {
            remainder = number %10;
            sum += remainder;
            number /=10;
        }
        System.out.println(sum);
    }
}





