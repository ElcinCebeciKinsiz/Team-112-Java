package day27_StringBuilders;

public class C02_Reverse {
    public static void main(String[] args) {

        // please reverse the text
        String str = "Java is beautiful";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse()); // lufituaeb si avaJ
        sb.reverse();
        System.out.println(sb); //Java is beautiful
        System.out.println(str.replace('J', 'E'));
        System.out.println(str.replaceAll("beautiful", "usefull"));
        System.out.println(sb.insert(4, "E"));


    }
}
