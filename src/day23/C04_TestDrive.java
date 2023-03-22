package day23;

public class C04_TestDrive {
    /*
    Method has to have a return type
    Constructer can not have a return  type
    Method can have any name
    Constructer's name has to be same with the class name
    A method can be static
    But a constructer can not be static
     */
    public  C04_TestDrive ( String str){
        this(); // If we want to call a constructor, we should use this() code to call it.
        System.out.println("The constructor with string parameter is executed");
    }
    // a Constructer can not have a return type
    // a constructor name has to be same with the class name
    public C04_TestDrive(){
        System.out.println("Constructer is executed");
    }
    public static void main(String[] args) {
        C04_TestDrive obj1 = new C04_TestDrive("Hasan");
    }
    // a method has to have a return type
    // a method name can be anything
    public static void testMethod (){
        System.out.println("Test method is executed");
    }
}

