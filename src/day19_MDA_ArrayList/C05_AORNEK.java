package day19_MDA_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_AORNEK {
    public static void main(String[] args) {

        int[] arr = {1,2,3, 5, 7, 3, 4, 6, 8, 6, 3, 4, 9, 10, 11};

        List<Integer>sayilar=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (!sayilar.contains(arr[i])) {
                sayilar.add(arr[i]);

            }

        }
        System.out.println(sayilar);





















    }


}
