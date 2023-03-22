package Day08_NestedElse_Ternary_SwitchStatements;

import java.util.Scanner;

public class C07_Ternary_Triangle_Question {
    public static void main(String[] args) {

        // Get 3 sides of triangle from the user and print "Equilateral Triangle" if they are all same, otherwise
        // print "Not equilateral"//

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 sides of triangle");
        int side1= scan.nextInt();
        int side2= scan.nextInt();
        int side3= scan.nextInt();

        System.out.println(side1==side2&& side1==side3 ? "Equilateral": "Not equalateral");




    }
}
