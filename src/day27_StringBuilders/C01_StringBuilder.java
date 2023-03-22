package day27_StringBuilders;

public class C01_StringBuilder {
    public static void main(String[] args) {

            String str = "Ali Can";
            StringBuilder sb1 = new StringBuilder();
            System.out.println(sb1.capacity());  // 16
            System.out.println(sb1.length());  // 0
            StringBuilder sb2 = new StringBuilder("Ali Can");
            System.out.println(sb2);
            System.out.println(sb2.capacity()); // 23
            System.out.println(sb2.length());  // 7
            sb1.append(" Yilmazturk");
            System.out.println(sb1.length()); //11
            System.out.println(sb1.capacity()); //16
            sb1.append("Mustafa");
            System.out.println(sb1.length()); //18
            System.out.println(sb1.capacity()); //34  34 = 2* old capasity +2
            System.out.println(sb1); //  YilmazturkMustafa
            sb1.append("Everybody loves Java, and studies a lot");
            System.out.println(sb1.length()); //57
            System.out.println(sb1.capacity()); //70  // 34*2+2 =70
            System.out.println(sb1); //  YilmazturkMustafaEverybody loves Java, and studies a lot
            StringBuilder sb3 = new StringBuilder("Java life");
            System.out.println(sb3.capacity()); // 25
            System.out.println(sb3.length()); // 9
            StringBuilder sb4 = new StringBuilder(11);
            sb4.append("14569874541");
            System.out.println(sb4.length()); //11
            System.out.println(sb4.capacity());// 11
            sb4.append(" : TC no");
            System.out.println(sb4);
            System.out.println(sb4.length()); //19
            System.out.println(sb4.capacity());// 24
            String str1 = "Java is the life";
            sb4.append(str1,5,11);
            System.out.println(sb4); // 14569874541 : TC nois the
            // trim :: to delete unused place by stringBuilder, to save memory
            System.out.println(sb4.capacity()); //50
            System.out.println(sb4.length()); // 25
            sb4.trimToSize();
            System.out.println(sb4.capacity()); //25
            System.out.println(sb4.length()); // 25
        }
    }































