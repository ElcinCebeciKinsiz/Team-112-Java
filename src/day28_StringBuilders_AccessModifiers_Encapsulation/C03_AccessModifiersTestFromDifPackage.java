package day28_StringBuilders_AccessModifiers_Encapsulation;

public class C03_AccessModifiersTestFromDifPackage {
    public static void main(String[] args) {
        // Public
        System.out.println(C01_AccessModifiers.publicStr); // I could be able to reach public variable from different package
        C01_AccessModifiers.publicStr="I can change public variable from different package"; // because it is public
        //Default
        //C01_AccessModifers.defaultStr // because defaultStr is default we can not reach it from different package
        // it can be only used in same package
        //protected
        //C01_AccessModifers.protectedStr // just like the default access modifier, I can not reach it from another package
    }
}


