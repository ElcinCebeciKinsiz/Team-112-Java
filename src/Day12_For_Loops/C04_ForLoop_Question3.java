package Day12_For_Loops;

import java.util.Scanner;

public class C04_ForLoop_Question3 {
    public static void main(String[] args) {
        //Question 3- Take positive numbers as starting and ending values from the user,
        // print the sum of all numbers between them, including the borders.
        // If the end value is less than the start value, print a warning and end the process
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a staring number");
        int startingNumber = scan.nextInt();
        System.out.println("please enter an ending Number");
        int endingNumber = scan.nextInt();
        int sum = 0;
        if (endingNumber<startingNumber){
            System.out.println("please ending Value should be higher than staring value");
        }else {
            for (int i = startingNumber; i <=endingNumber ; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}




