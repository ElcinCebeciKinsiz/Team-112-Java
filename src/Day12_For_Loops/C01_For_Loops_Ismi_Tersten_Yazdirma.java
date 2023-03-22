package Day12_For_Loops;

import java.util.Scanner;

public class C01_For_Loops_Ismi_Tersten_Yazdirma {
    public static void main(String[] args) {
        // Get a String from user and print the String in reverse//

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a String");
        String str= scan.next();

        int startingNumber=str.length()-1;
        String outputStr= "";

        for (int i=startingNumber; i>=0 ; i--) { // if String was ALI starting Number would be 2 (A=0, l=1, i=2 index number)

            outputStr=outputStr+str.charAt(i);
        }










    }




}
