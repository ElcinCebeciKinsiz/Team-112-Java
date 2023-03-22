package day27_StringBuilders;

public class C03_Compare_Equals {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";
        //System.out.println(sb1==str);
        // we can not check equality between different non-primitive data types by == symbols
        System.out.println(sb1==sb2); // false
        System.out.println(sb1==sb1); // true
        System.out.println(sb1.equals(sb2)); // false
        /*
        If we try to compare to different stringBuilders by equals method. Result will be always false. Because this
        equals method is coming from object class, not from the stringBuilder Class
                 */
        System.out.println(sb1.equals(str)); // false
        System.out.println(sb1.equals(sb1)); // true
        // To check the equality we should use compareTo()
        //System.out.println(sb1.compareTo(str)); CTE, both sides should be String Builder
        System.out.println(sb1.compareTo(sb2)); // 0  // Java
        StringBuilder sb3 = new StringBuilder("Hava");
        StringBuilder sb4 = new StringBuilder("Hara");
        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); // 2
        System.out.println(sb3.compareTo(sb4)); // 4
        System.out.println(sb4.compareTo(sb3)); // -4
        /*
        When we use compareTo() method, if the result is 0 this means they are equal
        if it is something else, it means they are not same. The result will be calculated from the ascii table value
        difference. But we can not know which characters are different so if the result is not zero. It wont be  useful
        for us.
         */
    }
}

