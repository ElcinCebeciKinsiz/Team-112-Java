package day17_Arrays;

import Day16_Scope.ADoctor;

import java.util.Arrays;

public class C04_IncreaseValues {

    public static void main(String[] args) {

      //Question-Increase the value of any array by 5//

        int [] intArr = {2,5,8,4};
        int increment = 5;

        intArr=C03_CreatingMethodToIncreaseValues.changeValuesOfArray(intArr,increment);

        System.out.println(Arrays.toString(intArr));

        System.out.println("''''''''''''''");

//int shortestIndex=arr[0].length<arr[1].length? arr[0].length:arr[1].length;//



    }


}




