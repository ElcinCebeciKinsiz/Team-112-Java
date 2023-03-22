package Day15_While_Do_While_Loop;

public class C06_Do_While_Loops {
    public static void main(String[] args) {

    int startingNumber = 10;
    int sum = 0;
       while (startingNumber<20){
        sum+=startingNumber;
        startingNumber++;
    }
        System.out.println("sum of numbers from while loop "+sum);
        System.out.println("''''''''''''''''''''");

    startingNumber = 10;
    sum =0;
       do {
        sum+=startingNumber;
        startingNumber++;
    }while (startingNumber<20);
        System.out.println("sum of numbers from do while loop "+sum);
}
}

