package Day12_For_Loops;

import java.util.Scanner;

public class C01_For_Loop_Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 7 == 0) {
            }
            System.out.println(i + " ");
        }

        }

    }