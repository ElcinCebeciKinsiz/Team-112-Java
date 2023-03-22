package Day08_NestedElse_Ternary_SwitchStatements;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class C010_Ternary_Switch_Statements {
    public static void main(String[] args) {
    // We took a number from user for examle 100. Check
    //if 100 is positive (first condition), check if it is an even number
    //If it is not a positive number,  check if it has 3 digits

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scan.nextInt();
        System.out.println(number>0
                           ?number%2==0 ? "Even Number" : "Not Even Number"
                           :number>-1000&& number<-90? "3 Digits": "Not 3 Digits");







    }











}
