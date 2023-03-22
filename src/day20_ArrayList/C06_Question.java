package day20_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C06_Question {
    public static List<Integer> positiveDividers () {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int number = scann.nextInt();
        List<Integer> dividers = new ArrayList<>(); // created an empty list to store positive dividers
        for (int i = 1; i <=number ; i++) {
            if (number % i == 0){
                dividers.add(i);
            }
        }
        return dividers;
    }
    public static List<Integer> positiveDividers (int number) {
        List<Integer> dividers = new ArrayList<>(); // created an empty list to store positive dividers
        for (int i = 1; i <=number ; i++) {
            if (number % i == 0){
                dividers.add(i);
            }
        }
        return dividers;
    }
    public static void main(String[] args) {
        //Question 6- Create a method that takes a positive integer from the user
        // and returns all positive integers that can divide that integer to us as a list.
        System.out.println(positiveDividers());
    }
}




