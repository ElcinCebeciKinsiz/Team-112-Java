package day20_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class C08_Finbonacci {
    public static void main(String[] args) {
        // Question 4- Take a given positive integer n,
        // create a method that returns us the first n Fibonacci numbers as a list.
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
        System.out.println(fibonacciNumbers(40));
    }
    public static List<Integer> fibonacciNumbers(int number) {
        List<Integer> fibonacciNumbersList = new ArrayList<>();
        if (number == 0) {
            System.out.println("you entered wrong number");
        } else if (number == 1) {
            fibonacciNumbersList.add(0);
        } else if (number == 2) {
            fibonacciNumbersList.add(0);
            fibonacciNumbersList.add(1);
        } else {
            int firstNumber = 0;
            fibonacciNumbersList.add(firstNumber);
            int secondNumbers = 1;
            fibonacciNumbersList.add(secondNumbers);
            int nextNumber = firstNumber + secondNumbers;
            fibonacciNumbersList.add(nextNumber);
            while (fibonacciNumbersList.size() < number) {
                firstNumber = secondNumbers;
                secondNumbers = nextNumber;
                nextNumber = firstNumber + secondNumbers;
                fibonacciNumbersList.add(nextNumber);
            }
        }
        return fibonacciNumbersList;
    }
}


