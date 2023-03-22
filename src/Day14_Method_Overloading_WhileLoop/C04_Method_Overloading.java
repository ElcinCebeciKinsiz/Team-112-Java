package Day14_Method_Overloading_WhileLoop;

public class C04_Method_Overloading {
    public static void main(String[] args) {

// how does java find the method to use
        /*
        1) it will check the names
        2) it will check arguments if they are %100 match with the parameters
        3) can java handle the situation by auto casting
        4) java will choose the easiest one ( if possible less casting)
         */
        add(4,5);
        add(3.4,5.3);
        // add("ali","veli"); as long as we do not crate another method for String data type, java won't be able to execute it
        add(3f,5f); // these numbers are float data type because of the "f" letter
        add('d','h');
        add(3f,4); // what will happen here?
    }
    public static void add(int a, int b){
        System.out.println("the sum of two integers is : " + (a+b));
    }
    public static void add(double a, double b){
        System.out.println("the sum of two doubles is : "+ (a+b));
    }
    public static void add(int a,double b){
        System.out.println("the sum of integer and double is : "+ (a+b));
    }
    public static void add (double a , int b){
        System.out.println("the sum of double and integer is : "+(a+b));
    }
    // you can not create a method by using same name and same data types
//    public static void add (int firstNumber, int secondNumber){
//        System.out.println("the sum of two integers is : " + (firstNumber+secondNumber));
//    }
}









