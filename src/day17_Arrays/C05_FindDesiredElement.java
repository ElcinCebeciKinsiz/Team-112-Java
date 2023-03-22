package day17_Arrays;

public class C05_FindDesiredElement {
    public static void main(String[] args) {
// check if the desired element is in side of an array, create a method for this goal

        int [] intArr = {3,6,7,3,6};
        int desiredNumberasdf= 7;
        printIfArrayHasElement(intArr,desiredNumberasdf);

        String[] strArr = {"hasan","Ahmet","John","ali","ali"};
        String desiredStr="ali";

        printIfArrayHasElement(strArr,desiredStr);

    }

    public static void printIfArrayHasElement(int[] intArray, int desiredNumber){
        System.out.println("We are working on int");
        int flag=0;
        for (int i = 0; i <intArray.length; i++) {
            if (intArray[i]==desiredNumber){
                flag++;
            }
        }
        System.out.println(flag);
    }

    public static void printIfArrayHasElement(String[] strArr, String str){
        System.out.println("We are working on String");
        int flag =0;
        for (int i = 0; i <strArr.length ; i++) {

            if (strArr[i].equals(str)){
                flag++;
            }
        }

        System.out.println(flag);


    }


}




