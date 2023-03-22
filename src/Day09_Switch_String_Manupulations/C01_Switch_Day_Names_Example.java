package Day09_Switch_String_Manupulations;

import java.util.Scanner;

public class C01_Switch_Day_Names_Example {
    public static void main(String[] args) {
        /*IMPORTANT NOTE= WE cannot use long, double, float or boolean in switch*/

        /* SORU- Get a letter from user and write the days starts with it
                 If invalid entry give a message saying invalid letter
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a letter");
        char day = scan.next().charAt(0);
        day = Character.toUpperCase(day); // kullanici buyuk harfde kullanca kucuk harfde kullansa cikti buyuk harfle
                                          // yazilacak bu methodu koydugumuz icin
        switch (day) {
            case 'M':
                System.out.println("Monday");
                break;
            case 'T':
                System.out.println("Tuesday and Thursday");
                break;
            case 'W':
                System.out.println("Wednesday");
                break;
            case 'F':
                System.out.println("Friday");
                break;
            case 'S':
                System.out.println("Saturday and Sunday");
                break;
            default:
                System.out.println("Invalid Letter");


        }


    }
}
