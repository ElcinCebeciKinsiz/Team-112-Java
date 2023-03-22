package Day14_Method_Overloading_WhileLoop;

import java.util.Scanner;

public class C07_WhileLoop_Password_Question {
    public static void main(String[] args) {
        // ask for a password from user
        // it should meet the conditions mentioned below
        // print the errors and ask to fix them
        // when user enters  correct password, print " creating a password is successful
        // 1) first letter should be a lowercase
        // 2) last letter should be a capital
        // 3) password should not have any spaces
        // 4) it should have at least 8 characters

        Scanner scan=new Scanner(System.in);
        String password ="";
        int flag = 0;
        int numberOfTry=0;
        while (flag!=4){
            flag =0;
            System.out.println("Please enter a password");
            password = scan.nextLine();
            // 1) first letter should be a lowercase
            if (password.charAt(0)>='a' && password.charAt(0)<='z'){
                flag++;
            }else {
                System.out.println("First letter is not a lowercase");
            }
            // 2) last letter should be a capital
            if (password.charAt(password.length()-1)>='A' && password.charAt(password.length()-1)<='Z'){
                flag++;
            } else {
                System.out.println("last letter is not a capital");
            }
            // 3) password should not have any spaces
            if (password.contains(" ")){
                System.out.println("Password should not have any space");
            }else {
                flag++;
            }
            // 4) it should have at least 8 characters
            if (password.length()<8){
                System.out.println("Password should have at least 8 characters");
            } else {
                flag++;
            }
        }
        System.out.println("creating a password is successful");
    }
}















