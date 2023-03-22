package Day14_Method_Overloading_WhileLoop;

import Day13_Nested_Loops_Method_Creating.C10_ReversedString;

import java.util.Scanner;

public class C01_Method_Creation {
    public static void main(String[] args) {
        // use the method from day13 to reverse strings and check if it is a palindrome (madam, eye,
        // take a string from user and check if it is a palindrome

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a string");
            String str = scan.nextLine();
            String reversedStr = C10_ReversedString.reverseString(str);
            if (str.equals(reversedStr)){
                System.out.println("Yes they are palindrome");
            }else {
                System.out.println("they are not palindrome");
            }
        }






    }

