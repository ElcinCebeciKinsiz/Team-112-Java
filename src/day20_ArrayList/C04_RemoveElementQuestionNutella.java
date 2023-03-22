package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_RemoveElementQuestionNutella {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("Nutella");
        products.add("Barbie");
        products.add("Toy Car");
        products.add("Margaretta");
        products.add("Nestle");
        products.add("Candy");


        String unwantedLetter = "N";

        List<String> cleanList = new ArrayList<>();
        for (int i = 0; i < products.size() ; i++) {
            if (!products.get(i).contains(unwantedLetter)) {
                cleanList.add(products.get(i));

            }
        }
        System.out.println(cleanList);

        }
    }



