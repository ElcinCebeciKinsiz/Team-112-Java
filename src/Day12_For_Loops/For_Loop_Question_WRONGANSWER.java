package Day12_For_Loops;

import java.util.Scanner;

public class For_Loop_Question_WRONGANSWER {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //WRONG YOU  NEED CODES// CEVAP 75 OLMALI 10 15 YAINCA KULLANICI
        System.out.println("Please enter a starting number");
        int startingNumber = scan.nextInt();
        System.out.println("Please enter a end number");
        int endNumber = scan.nextInt();

        int sum=0;

        if(startingNumber<endNumber) {
            for (int i=startingNumber; i<=endNumber; i++) {
                sum=sum+1;
            }
        } else{
            for (int i=startingNumber; i>=endNumber; i--) {
                sum=sum+1;
            }
        }

        System.out.println(sum);




    }
}
