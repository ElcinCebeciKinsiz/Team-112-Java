package Day07_IfStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        //Question 3- Ask the user's age,
        // print "You can retire" if he is 65 years or older,
        // otherwise print the number of years he has to work to retire.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        if (age>=65){
            System.out.println("You can retire");
        }else {
            System.out.println("you can not retire, number of years : "+ (65-age));
        }
    }
}
