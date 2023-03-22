package Day10_String_Manipulations;

public class C08_LastIndexOf {
    public static void main(String[] args) {
    String str="Java is funny"; // It will start looking at desired letter/item it will start searching from end but it
                                // found the desired letter will count and give the index starting from start point


        System.out.println(str.lastIndexOf("a")); // 3 (Java sonuncu a'dan baslayip J'ye dogru gitti. Sonra J den itibaren
                                                      // index sayisini 3 olarak yazdirdi

        System.out.println(str.lastIndexOf("n")); // 11

        System.out.println(str.lastIndexOf("is"));// 5

        System.out.println(str.lastIndexOf("Ali")); // -1 cunku Ali olmadigi icin bizim cumlemizde







    }
}
