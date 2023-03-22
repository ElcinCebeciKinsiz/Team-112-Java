package Day10_String_Manipulations;

public class C03_StartsWith {
    public static void main(String[] args) {
    String str="Java is great";

        System.out.println(str.startsWith("java"));// False because it starts with Java not with java
        System.out.println(str.startsWith("Java"));// True
        System.out.println(str.startsWith("J"));// True

        String str3="Jav";
        System.out.println(str.startsWith(str3));// True str1=Java str2=Jav oldugu icin True

        System.out.println("........................");
        System.out.println(str.endsWith("t")); //True
        System.out.println(str.endsWith("reat"));// True



        String str2 = "Jav";
        System.out.println(str.startsWith(str2)); //true
        System.out.println(str.startsWith(str)); // true
        System.out.println(str.startsWith("")); //true
        System.out.println("=========================");
        System.out.println(str.endsWith("t")); // true
        System.out.println(str.endsWith("eat")); // true
        System.out.println(str.endsWith("")); // true
        System.out.println(str.endsWith("is great")); // true
        System.out.println(str.endsWith(str.substring(str.length()-1))); // true
        System.out.println(str.startsWith("is",5)); // true
    }
}









