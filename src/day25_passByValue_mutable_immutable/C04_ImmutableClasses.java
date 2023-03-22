package day25_passByValue_mutable_immutable;

public class C04_ImmutableClasses {
    public static void main(String[] args) {
    String str="Jave is the best";
    str=str.toLowerCase();
        System.out.println(str); // java is the best
        str=str.toUpperCase();
        System.out.println(str); //JAVA IS THE BEST

        String s="Java";
        for (int i = 0; i <100 ; i++) {
            s=s+ "."; // Bunu yazdirinca Java..................................... (100 tane dot olacak)

        }
        System.out.println(s);

















    }
}
