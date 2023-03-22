package day20_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class C02_IndexOf {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Esra");  // ,"Mohammad","Kaan","Bahadir","Seda"
        names.add("Mohammad");
        names.add("Bahadir");
        names.add("Kaan");
        names.add("Bahadir");
        names.add("Seda");
        names.add("Bahadir");
        System.out.println(names); // [Esra, Mohammad, Kaan, Bahadir, Seda]
        // print the value of index 2
        System.out.println(names.get(2)); // Kaan
        System.out.println(names.indexOf("Mohammad")); // 1
        System.out.println(names.lastIndexOf("Seda")); // 4
        System.out.println(names); // [Esra, Mohammad, Bahadir, Kaan, Bahadir, Seda, Bahadir]
        System.out.println(names.indexOf("Bahadir")); // 2
        System.out.println(names.lastIndexOf("Bahadir")); // 6
    }
}
