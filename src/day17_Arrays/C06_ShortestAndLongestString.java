package day17_Arrays;

public class C06_ShortestAndLongestString {
    public static void main(String[] args) {
        //Question 6- Create a method that prints the longest and shortest words in a given String array.

        String[] nameArr = {"Kaan", "Bahadir", "Ibrahim", "Ayse", "Esra", "Ali", "Muhammed", "Su"};

        shortestAndLongest(nameArr);

    }

    public static void shortestAndLongest(String[] nameArr) {
        String longestWord = nameArr[0];
        String shortestWord = nameArr[0];

        for (int i = 0; i < nameArr.length; i++) {

            if (nameArr[i].length() > longestWord.length()) {
                longestWord = nameArr[i];
            }

            if (nameArr[i].length() < shortestWord.length()) {
                shortestWord = nameArr[i];
            }
        }
        System.out.println("The longest word is : " + longestWord);
        System.out.println("The shortest word is : " + shortestWord);
    }
}
