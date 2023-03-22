package day18_Arrays_MDA;

import java.util.Arrays;

public class C06_SplitMethod {
    public static void main(String[] args) {

        String str = "Java is the characters";
        System.out.println(str.length());  //22
        // how many words are there?
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
//        int[] arrInt = {1,2,3,4,5};  // [1, 2, 3, 4, 5]  // ", " comes from java itself. THey are not actually in the array.
//        System.out.println(Arrays.toString(arrInt));
        System.out.println(arr.length);  // number of words of str is 4
        // how many letters does the longest word have?
        int biggestNumberOfCharacters = arr[0].length();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length()>biggestNumberOfCharacters){
                biggestNumberOfCharacters=arr[i].length();
            }
        }
        System.out.println("The longest word has "+biggestNumberOfCharacters +" characters");

        System.out.println(".......................");

//Verlen stringde J harfini yok et
        System.out.println(Arrays.toString(str.split("J")));

            }
}







