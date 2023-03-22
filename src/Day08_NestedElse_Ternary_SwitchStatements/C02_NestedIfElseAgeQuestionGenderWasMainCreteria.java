package Day08_NestedElse_Ternary_SwitchStatements;

import java.util.Scanner;

public class C02_NestedIfElseAgeQuestionGenderWasMainCreteria {
    public static void main(String[] args) {
        //Question 1- Get the gender and age from the user.
        // Female, 60 years old and over,
        // Men 65 years and older can retire.
        // Print “You can retire” or “You need to work .. more years to retire”,
        // taking into account gender and age.
        // Gender was our first creteria,

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your age");// First outer condition(big condition)//
        int age= scan.nextInt();

        System.out.println("Enter your gender"); // Second outer Condition (big condition)//
        char genger=scan.next().charAt(0);

        if(genger=='F' || genger=='f') {  // we will write the code according to Female//
            if (age<16 || age>100){
                System.out.println("Invalid age entered, please re enter");
            } else if (age<60) {
                System.out.println("You need to work"+" " + (65-age) +" "+ "more years to retire");
            }else {
                System.out.println("You can retire");
            }



        } else if (genger=='M'|| genger=='m'){
            if(age<16 || age>100) {
                System.out.println("Invalid age entered, please re enter");

            }else if (age<65) {
                System.out.println("You need to work" +" "+ (65-age)+ " "+"more years to retire");
            }else {
                System.out.println("You can retire");
            }
        }else {
            System.out.println("Invalid gender entered please check and re-enter");
        }



















    }

}
