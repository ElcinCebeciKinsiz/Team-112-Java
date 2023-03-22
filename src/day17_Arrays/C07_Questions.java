package day17_Arrays;

import java.util.Arrays;

public class
C07_Questions {
    public static void main(String[] args) {
        // Question 3- (Interview) Create a method that will shift (slide) all the elements
        // in a given array to the right and move the last element to the beginning, save the array as new.

        //Ex : input : [4,5,6,7] is the final state of the array. : [7,4,5,6]



        int [] intArr= {4,5,6,7};

        int temp = intArr[intArr.length-1];
        // if we did this by hard code, It would be like this
//           intArr[3]=intArr[2];
//           intArr[2]=intArr[1];
//           intArr[1]= intArr[0];
//           intArr[0]=temp;
//        System.out.println(Arrays.toString(intArr));

        for (int i = 0; i < intArr.length-1; i++) {
            intArr[intArr.length-1-i] = intArr[intArr.length-2-i];
        }

        intArr[0]=temp;
        System.out.println(Arrays.toString(intArr));

    }
}




