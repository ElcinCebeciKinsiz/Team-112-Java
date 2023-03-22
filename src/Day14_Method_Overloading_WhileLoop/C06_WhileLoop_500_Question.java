package Day14_Method_Overloading_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop_500_Question {
    public static void main(String[] args) {
        // take a lot of numbers from user
        // as long as sum of these numbers is lower than 500, continue
        // at the end, print how many numbers user entered and sum of numbers
        Scanner scan = new Scanner(System.in);
        int sum =0;
        int enteredNumber =0;
        int numberOfEnteredNumbers=0;
        while (sum<500){                  // toplam 500 e ulasana kadar Please enter a number mesaji ver//
            System.out.println("Please enter a number");
            enteredNumber = scan.nextInt();
            sum= sum + enteredNumber;  // sum+=enteredNumber;
            numberOfEnteredNumbers++;
        }
        System.out.println("Number of entered Numbers is : "+numberOfEnteredNumbers);
        System.out.println("sum = " + sum);
    }
}








