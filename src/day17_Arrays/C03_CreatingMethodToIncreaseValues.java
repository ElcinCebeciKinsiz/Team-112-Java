package day17_Arrays;

import java.util.Arrays;

public class C03_CreatingMethodToIncreaseValues {
    public static void main(String[] args) {
        // create a method to increase values of an array by 2

        int[] intArr = {3,6,4,9};

        intArr =changeValuesOfArray(intArr,2);

        System.out.println(Arrays.toString(intArr));

    }

    public static int[] changeValuesOfArray(int[] intArr, int increment){

        for (int i = 0; i <intArr.length ; i++) {
            intArr[i] = intArr[i]+increment;
        }
        return intArr;
    }




}





