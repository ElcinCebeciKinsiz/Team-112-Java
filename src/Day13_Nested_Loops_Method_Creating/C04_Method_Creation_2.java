package Day13_Nested_Loops_Method_Creating;

public class C04_Method_Creation_2 {

        // create a method that adds two numbers
        public static void main(String[] args) {
            add(3,5);
            add(455445,334);
            nothing();
        }
        public static void add (int firstNumber, int secondNumber  ) {
            int result = firstNumber + secondNumber ;
            System.out.println(" the result is : "+result);
        }
        public static void nothing(){
            System.out.println("nothing will be printed");
        }
    }





