package Day10_String_Manipulations;

public class C02_contains {
    public static void main(String[] args) {
    String str2= "Learn Java, get a job";

        System.out.println(str2.contains("Java"));// True-str String'i icinde Java var mi??


        String str = "Learn Java, get the job";
        System.out.println(str.contains("Java")); //true
        System.out.println(str.contains("th")); // true
        String desiredWord = "Le";
        System.out.println(str.contains(desiredWord)); // true
        System.out.println(str.contains("a")); // true
        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains(""));  // true
        System.out.println(str.contains("java")); // false
        if (str.contains("java")){
            System.out.println("yes str contains java");
        }else {
            System.out.println("no str does not contain java");
        }
    }
}






