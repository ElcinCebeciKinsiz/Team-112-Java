package day19_MDA_ArrayList;

public class C01_MDA_Q {
    public static void main(String[] args) {
        //Question 5- Create a method that prints the sum of the last elements of each inner array in a given 2 dimensional array.
        int[][] intArr = {{2,3,4,5},{3,4,5},{2,3}};
        sumOfLastElementsOfArray(intArr);

    }
    public static void sumOfLastElementsOfArray(int[][] arr){
        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum= sum+ arr[i][arr[i].length-1];
        }
        System.out.println("sum of last elements is : "+sum);
    }
    }

