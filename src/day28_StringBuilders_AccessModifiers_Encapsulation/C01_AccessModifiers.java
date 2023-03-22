package day28_StringBuilders_AccessModifiers_Encapsulation;

public class C01_AccessModifiers {
    /*
Access Modifiers
Public = It can be reached from everywhere
*/
    //public  :: can be reached and changed from anywhere in the project
    public static String publicStr = "public String that everybody can reach, see and use";
    // if a variable is not static, It becomes non-static variable ( Instance variable ( object variable))
    // if we want to reach this variable, we need to create an object from the class itself
    public String publicStrObject = "you can reach this variable by creating an object from this class";
    //private :: It can be called and used only in same class. It wont be accessible from any otherclass or package in
    // the project (( prived to this class))
    private static String privateStr ="This one is a personal data, no one can reach it";
    //default :: if you don't add any access modifiers, java will accept it as a default access modifier
    // this data can be reach from the same package, not from anywhereelse
    static String defaultStr =" this one is default";
    //protected :: it is very similar to default. It can be used in same package and
    static protected String protectedStr = "Protected String is very similar with default access modifier";
    public static void main(String[] args) {
        System.out.println(privateStr + "hello");
        // public String publicStrObject, to reach a non-static variable in a static method we need to create an object
        C01_AccessModifiers C01_AccessMod = new C01_AccessModifiers(); // created an object from this class to reach the non-static variable
        System.out.println(C01_AccessMod.publicStrObject); // by using the object, I could be able to reach, see, update a non-static variable
    }
}






