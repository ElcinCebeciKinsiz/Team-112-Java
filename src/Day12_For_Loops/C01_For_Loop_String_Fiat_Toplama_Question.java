package Day12_For_Loops;

public class C01_For_Loop_String_Fiat_Toplama_Question {
    public static void main(String[] args) {
        String str ="J123ava344 i+%s very fun4545ny!!";
        // clean str from numbers
        str = str.replaceAll("\\d","");  // deleted numbers
        System.out.println(str); // Java i+%s very funny!!
        str= str.replaceAll(" ","5");   // changed spaces with a number
        System.out.println(str); //Java5i+%s5very5funny!!
        str = str.replaceAll("\\W","");  // deleted everything except numbers and letters
        System.out.println(str); // Java5is5very5funny
        str = str.replaceAll("5"," ");  // deleted previously created numbers
        System.out.println(str); // Java is very funny
        // If we want to change a group of characters we can use replaceAll with regex.
        /*
        If you want to change all digits you can use "\\d"  ,,
        all spaces
         */
    }
}