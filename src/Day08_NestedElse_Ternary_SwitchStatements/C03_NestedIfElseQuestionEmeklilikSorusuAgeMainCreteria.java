package Day08_NestedElse_Ternary_SwitchStatements;

import java.util.Scanner;

public class C03_NestedIfElseQuestionEmeklilikSorusuAgeMainCreteria {
    public static void main(String[] args) {

        //Question 1- Get the gender and age from the user.
        // Female, 60 years old and over,
        // Men 65 years and older can retire.
        // Print “You can retire” or “You need to work .. more years to retire”,
        // taking into account age then gender creteria.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an age");
        int age = scan.nextInt();
        System.out.println("Please enter your gender");
        char gender = scan.next().charAt(0);
        if (age < 18 || age > 140) {
            System.out.println("invalid age");
        } else if (age < 60) {
            if (gender == 'F' || gender == 'f') {
                System.out.println("You need to work " + (60 - age) + " more years to retire");
            } else if (gender == 'm' || gender == 'M') {
                System.out.println("You need to work " + (65 - age) + " more years to retire");
            } else {
                System.out.println("Invalid Gender");
            }
        } else if (age < 65) {
            if (gender == 'F' || gender == 'f') {
                System.out.println("you can retire");
            }
            if (gender == 'M' || gender == 'm') {
                System.out.println("You need to work " + (65 - age) + " more years to retire");
            } else {
                System.out.println("Invalid Gender");
            }
        } else { //65 140
            if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
                System.out.println("you can retire");
            } else {
                System.out.println("Invalid Gender");
            }
        }
    }
}












