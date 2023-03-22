package Day14_Method_Overloading_WhileLoop;

public class C05_WhileLoop {
    public static void main(String[] args) {
          // Question-Print all the numbers between 50 and 100 (including borders)//

            for (int i = 0; i <10 ; i++) {
                System.out.print(i+" ");
            }
            System.out.println("========================");
            // print all the numbers between 50 and 100 (including borders)
            // if we know the number of loops, we prefer using fori lops
            for (int i = 50; i <=100 ; i++) {
                System.out.print(i + " ");
            }
            System.out.println("======================");
            // if we don't know when loop ends, we can use while loops
            int number =50; // starting number
            while (number<=100){
                System.out.print(number + " ");
                number++;
            }
        }
    }





