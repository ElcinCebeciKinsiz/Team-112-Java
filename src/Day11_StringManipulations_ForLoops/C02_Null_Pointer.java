package Day11_StringManipulations_ForLoops;

public class C02_Null_Pointer {
    public static void main(String[] args) {

        String str;
        //
        //System.out.println(str); // CTE
        //System.out.println(str.concat("Ali"));
        // you can create a variable without assigning any value to it
        // but you can not use it in coding
        String newStr = null; // we have not assined any value to this String, but still if we want to use this variable
        // we need to assign null to it
        //String str2 = "null"; // null is not like that we do not need to use "" symbols because we are not assigning
        // any value. Instead we are just informing java that it has nothing but I might use it in coding
        //System.out.println(newStr.concat("Java")); // RTE
        System.out.println(newStr); // null
        System.out.println(newStr + "Java");  // nullJava
        // we can not assign null to primitive data types. Data type should be a non-pritive data type
        //int b = null;
        Integer a = null;
        //
        String str3 = ""; // we did not assign any variable to str3 but there is "nothing" inside of it so we can use
        // it whereever we want
        System.out.println(str3.concat("Java"));
        //System.out.println(newStr.isBlank());  // the variable, new Str hasn't been created so we can not check if it is
        //System.out.println(newStr.isEmpty()); // empty or blank
    }
}


