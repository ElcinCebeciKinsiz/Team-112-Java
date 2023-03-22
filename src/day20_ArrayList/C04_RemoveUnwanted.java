package day20_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_RemoveUnwanted {
    // Question 3- Create a method that deletes the elements containing unwanted letters in a given String list
    // and returns the remaining part to us as a list.
    public static void main(String[] args) {
        List<String> list = C03_TakeNamesFromUserMethod.creatingListFromUser();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an unwanted letter");
        String unwantedLetter = scan.next().substring(0,1);

        List<String> newList = deleteNamesWhichContainsUnwantedLetter(list,unwantedLetter);
        System.out.println(newList);
    }
    public static List<String> deleteNamesWhichContainsUnwantedLetter(List<String> list, String unwantedLetter) {
        // we should not change size of any list in a loop
        // instead we will try to add all names which does not contain the letter to a new list
        List<String> perfectList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).contains(unwantedLetter)){
                perfectList.add(list.get(i));
            }
        }
        return perfectList;
    }
}




