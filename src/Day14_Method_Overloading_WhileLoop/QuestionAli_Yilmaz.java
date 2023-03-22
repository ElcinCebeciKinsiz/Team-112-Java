package Day14_Method_Overloading_WhileLoop;

import java.util.Scanner;

public class QuestionAli_Yilmaz {
    public static void main(String[] args) {
       /* Question 2- Get the user's name and surname separately in the main method
        Create a method that returns:
        //first letters of first and last name as capitals and rest should be in lower case

        //input : name : Ali     surname :YILMAZ
        output : Ali Yilmaz    */

        Scanner scan = new Scanner(System.in);
        System.out.println(("Lutfen adinizi giriniz"));
        String name = scan.next();

        System.out.println("Please enter your surname");
        String surname = scan.next();

        System.out.println (isimSoyisimMethod(name,surname));


    }

    public static String isimSoyisimMethod(String name, String surname) {



     String output= name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase()+ " "+
        surname.substring(0,1).toUpperCase()+ surname.substring(1).toLowerCase();



      return output;


        }
    }