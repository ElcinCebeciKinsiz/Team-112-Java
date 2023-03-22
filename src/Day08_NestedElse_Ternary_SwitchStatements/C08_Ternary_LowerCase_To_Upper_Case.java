package Day08_NestedElse_Ternary_SwitchStatements;

import java.util.Scanner;

public class C08_Ternary_LowerCase_To_Upper_Case {
    public static void main(String[] args) {
        //Get a letter from user and if it is lower case letter turn it into upper case otherwise print it as it is//

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter=scan.next().charAt(0);


        System.out.println('a'<=letter && letter<='z'? Character.toUpperCase(letter) : letter);

        System.out.println("..............");

        System.out.println(Character.isLowerCase(letter) ? Character.toUpperCase(letter): letter);// Girilen harf kucuk
                                         // harf ise buyuge cevir, yoksa oldugu gibi yazdir dedik burda//







    }



}
